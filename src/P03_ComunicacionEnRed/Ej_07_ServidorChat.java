package P03_ComunicacionEnRed;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ej_07_ServidorChat  {
	static final int MAXIMO = 5;//MAXIMO DE CONEXIONES PERMITIDAS	
	
	public static void main(String args[]) throws IOException {
		int PUERTO = 54321;	
		
		ServerSocket servidor = new ServerSocket(PUERTO);
		System.out.println("Servidor iniciado...");
		
		Socket tabla[] = new Socket[MAXIMO];//para controlar las conexiones	
		Ej_07_ComunHilos comun = new Ej_07_ComunHilos(MAXIMO, 0, 0, tabla);
		
		while (comun.getCONEXIONES() < MAXIMO) {
			Socket socket = new Socket();			
			socket = servidor.accept();// esperando cliente
			
			comun.addTabla(socket, comun.getCONEXIONES());
			comun.setACTUALES(comun.getACTUALES() + 1);
			comun.setCONEXIONES(comun.getCONEXIONES() + 1);			
			
			Ej_07_HiloServidorChat hilo = new Ej_07_HiloServidorChat(socket, comun);
			Thread t = new Thread(hilo);
			t.start();
		}	
		servidor.close();
	}//main
}//ServidorChat..  
