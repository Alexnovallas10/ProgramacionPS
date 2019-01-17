package P03_ComunicacionEnRed;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Ej_05_servidor_UDP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		int puerto = 7777;
		//InetAddress destino = InetAddress.getLocalHost(); // Obtenemos la IP del host local

		// Para decir cualquier otro host
		InetAddress destino = InetAddress.getByName("192.168.7.22");

		byte[] mensaje = new byte[1024];

		String saludo = "Hola ";
		mensaje = saludo.getBytes(); // Hay que pasar la cadena a bytes para el envío

		DatagramPacket paqueteUDP = new DatagramPacket(mensaje, mensaje.length, destino, puerto);
		
		DatagramSocket socket = new DatagramSocket();
		socket.send(paqueteUDP);
		
	}

}
