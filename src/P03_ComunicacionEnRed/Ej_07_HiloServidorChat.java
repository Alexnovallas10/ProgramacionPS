package P03_ComunicacionEnRed;

import java.io.*;
import java.net.*;

public class Ej_07_HiloServidorChat implements Runnable {
	DataInputStream fentrada;
	Socket socket = null;
	Ej_07_ComunHilos comun;

	public Ej_07_HiloServidorChat(Socket s, Ej_07_ComunHilos comun) {
		this.socket = s;
		this.comun = comun;
		try {
			// CREO FLUJO DE entrada para leer los mensajes
			fentrada = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			System.out.println("ERROR DE E/S");
			e.printStackTrace();
		}
	}// ..

	public void run() {
		System.out.println("NUMERO DE CONEXIONES ACTUALES: " + comun.getACTUALES());

		// NADA MAS CONECTARSE LE ENVIO TODOS LOS MENSAJES
		String texto = comun.getMensajes();
		EnviarMensajesaTodos(texto);

		while (true) {
			String cadena = "";
			

			try {
				cadena = fentrada.readUTF();

				if (cadena.trim().equals("*")) {// EL CLIENTE SE DESCONECTA
					comun.setACTUALES(comun.getACTUALES() - 1);
					System.out.println("NUMERO DE CONEXIONES ACTUALES: " + comun.getACTUALES());
					break;
				}
				cadena = invertirCadena(cadena);

				comun.setMensajes(comun.getMensajes() + cadena + "\n");
				EnviarMensajesaTodos(comun.getMensajes());
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		} // fin while

		// se cierra el socket del cliente
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// run

	// ENVIA LOS MENSAJES DEL CHAT A LOS CLIENTES
	private void EnviarMensajesaTodos(String texto) {
		int i;
		// recorremos tabla de sockets para enviarles los mensajes
		for (i = 0; i < comun.getCONEXIONES(); i++) {
			Socket s1 = comun.getElementoTabla(i);
			if (!s1.isClosed()) {
				try {
					DataOutputStream fsalida = new DataOutputStream(s1.getOutputStream());
					fsalida.writeUTF(texto);					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} // for
		
	}// EnviarMensajesaTodos
	
	
	private String invertirCadena(String cadena) {
		
		String[] array;
		array = cadena.split(">");
		
		
		String cadenaInvertida = "";
		char invertida[]=array[1].toCharArray();	
		for (int i=invertida.length-1;i>=0;i--) {
			cadenaInvertida += invertida[i];
		}
		System.out.println(cadenaInvertida);
		return array[0]+">"+cadenaInvertida;
	}

}// ..HiloServidorChat