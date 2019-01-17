package P03_ComunicacionEnRed;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
/*
public class Ej_05_cliente_UDP {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		byte[] bufer = new byte[1024];

		DatagramSocket socket = new DatagramSocket(8888);   

		//ESPERANDO DATAGRAMA
		System.out.println("Esperando Datagrama .......... ");  
		DatagramPacket recibo = new DatagramPacket(bufer, bufer.length);
		socket.receive(recibo);//recibo datagrama

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(baos);
		
		out.writeObject(PersonaModel); //Se escribe el objeto persona en el stream

		out.close(); // Se cierra el stream

		byte[] bytes = baos.toByteArray(); // se toma  el objeto transformado en bytes
		
		
	}
}
*/