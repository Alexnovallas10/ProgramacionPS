package P03_ComunicacionEnRed;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Ej_02_Cliente {
	
	String texto = "";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		
		try {
			//crea el soket
			Socket sCliente = new Socket(InetAddress.getLocalHost(), 1234);
			
				
			
			OutputStream salida = sCliente.getOutputStream();
		}catch(Exception e) {
			System.out.println("");
		}
	}

}
