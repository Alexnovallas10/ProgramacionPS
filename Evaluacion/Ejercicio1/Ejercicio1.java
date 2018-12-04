package Ejercicio1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;





public class Ejercicio1 {
	
	

	public void ejecutar(String ruta) throws IOException {			
		File f1 = new File("./ej_1.txt");				
		FileReader fichero = new FileReader(f1);
		Process p;
		String texto;
		Scanner teclado = new Scanner(System.in);
		texto=teclado.nextLine();
		char b[] = new char[30];
		
		int i;
		//Leemos el fichero hasta que devuelva -1 y lo metemos en un array char
		while((i=fichero.read(b))!=-1) {
			System.out.print(b);
		}	
		fichero.close();
				

		
		
		
	
	}
}	
	
