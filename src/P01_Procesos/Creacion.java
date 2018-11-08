package P01_Procesos;

import java.io.IOException;

public class Creacion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// LINUX
		// final String orden[] = {"ls", "/"};
		// Process proceso = new ProcessBuilder(orden).start();

		// WINDOWS
		Process proceso = new ProcessBuilder("Explorer").start();
		
		

	}

}
