package P03_ComunicacionEnRed;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ej_02_Servidor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//crea el socket
		ServerSocket server = new ServerSocket(1234);
		
		//abre conexion
		System.out.println("Socket abierto");
		Socket sCliente = server.accept();
		server.close();

		InputStream entrada = sCliente.getInputStream();

		
		
		
	}

}
