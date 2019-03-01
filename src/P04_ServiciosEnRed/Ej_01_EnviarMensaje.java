package P04_ServiciosEnRed;

import java.io.IOException;
import java.net.ConnectException;

import org.apache.commons.net.smtp.AuthenticatingSMTPClient;
import org.apache.commons.net.smtp.SMTPClient;
import org.apache.commons.net.smtp.SMTPReply;

public class Ej_01_EnviarMensaje {

	public static void main(String[] args) {
		SMTPClient client = new SMTPClient();
		try {
			int respuesta;
			client.connect("localhost");
			System.out.print(client.getReplyString());
			respuesta = client.getReplyCode();

			if (!SMTPReply.isPositiveCompletion(respuesta)) {
				client.disconnect();
				System.err.println("Conexión rechazada por el servidor.");
				System.exit(1);
			}

			client.login("localhost"); // inicio de sesión HELO
			String destinatario = "jorge.chueca.guerra@iestubalcain.net";
			String mensaje = "Hola. Y Vinicius pa cuando";
			String remitente = "alejandro.sanesteban.pascual@iestubalcain.net";

			if (client.sendSimpleMessage(remitente, destinatario, mensaje))
				System.out.println("El mensaje se ha enviado a " + destinatario);
			else
				System.out.println("El mensaje no se ha podido enviar");

			// final de sesión QUIT
			client.logout();

			client.disconnect();

		}catch(ConnectException ce){
			System.err.println("Servidor NO iniciado");			
			System.err.println(ce.getMessage());
			System.exit(2);
		}
		catch (IOException e) {
			System.err.println("No se ha podido conectar al servidor");
			e.printStackTrace();
			System.exit(2);
		}

	}
}