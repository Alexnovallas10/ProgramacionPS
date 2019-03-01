package P04_ServiciosEnRed;

import java.io.IOException;
import java.io.Writer;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.spec.InvalidKeySpecException;
import java.util.Scanner;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import org.apache.commons.net.smtp.*;


public class Ej_06_ClienteSMTPAutenticado {

	public static void main(String[] args) throws NoSuchAlgorithmException, UnrecoverableKeyException,
	KeyStoreException, InvalidKeyException, InvalidKeySpecException {

	Scanner teclado = new Scanner(System.in);
		
	// se crea cliente SMTP seguro
	AuthenticatingSMTPClient client = new AuthenticatingSMTPClient();
	
	// datos del usuario y del servidor
	String server = "smtp.gmail.com";
	System.out.println("Introduce tu email:");
	String username = teclado.nextLine();
	System.out.println("Introduce la contraseña:");
	String password = teclado.nextLine();
	int puerto = 587;
	System.out.println("Introduce datos del remitente:");
	String remitente = teclado.nextLine();
	
	try {
		int respuesta;
	
		// Se crea la clave para establecer un canal seguro
		KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		kmf.init(null, null);
		KeyManager km = kmf.getKeyManagers()[0];
	
		// Conexión al servidor SMTP
		client.connect(server, puerto);
		System.out.println("1 - " + client.getReplyString());
		
		// Establecimiento de la clave para la comunicación segura
		client.setKeyManager(km);
	
		respuesta = client.getReplyCode();
		if (!SMTPReply.isPositiveCompletion(respuesta)) {
			client.disconnect();
			System.err.println("Conexión rechazada.");
			System.exit(1);
		}
	
		// se envía el commando EHLO
		client.ehlo(server);
		System.out.println("2 - " + client.getReplyString());
	
		// Necesita negociación TLS - MODO NO IMPLICITO
		
		// Se ejecuta el comando STARTTLS y se comprueba si es true
		if (client.execTLS()) {
			System.out.println("3 - " + client.getReplyString());
	
			// se realiza la autenticación con el servidor
			if (client.auth(AuthenticatingSMTPClient.AUTH_METHOD.LOGIN, username, password)) {
				System.out.println("4 - " + client.getReplyString());
				System.out.println("Introduce email del destinatario");
				String destino1 = teclado.nextLine();
				System.out.println("Introduce el asunto");
				String asunto = teclado.nextLine();
				System.out.println("Introduce el mensaje");
				String mensaje = teclado.nextLine();
				// se crea la cabecera
				SimpleSMTPHeader cabecera = new SimpleSMTPHeader(remitente, destino1, asunto);
	
				// el nombre de usuario y el email de origen coinciden
				client.setSender(remitente);
				client.addRecipient(destino1);
				System.out.println("5 - " + client.getReplyString());
	
				// se envia DATA
				Writer writer = client.sendMessageData();
				if (writer == null) { // fallo
					System.out.println("Fallo al enviar DATA.");
					System.exit(1);
				}
	
				writer.write(cabecera.toString()); // cabecera
				writer.write(mensaje);// luego mensaje
				writer.close();
				System.out.println("6 - " + client.getReplyString());
	
				boolean exito = client.completePendingCommand();
				System.out.println("7 - " + client.getReplyString());
	
				if (!exito) { // fallo
					System.out.println("Fallo al finalizar transacción.");
					System.exit(1);
				} else
					System.out.println("Mensaje enviado con exito......");
	
			} else
				System.out.println("USUARIO NO AUTENTICADO.");
		} else
			System.out.println("FALLO AL EJECUTAR  STARTTLS.");
	
	} catch (IOException e) {
		System.err.println("Could not connect to server.");
		e.printStackTrace();
		System.exit(1);
	}
	try {
		client.disconnect();
	} catch (IOException f) {
		f.printStackTrace();
	}
	
	System.out.println("Fin del envío.");
	System.exit(0);
	}
}