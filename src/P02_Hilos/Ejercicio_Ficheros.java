package P02_Hilos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio_Ficheros {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int contador=0;
		long t_inicio, t_fin;
		long tiempo_total;
		for(int i=1;i<5;i++) {
			File f = new File("D:\\Archivos de programa\\workspace\\Procesos\\src\\P02_Hilos\\ficheros\\"+i+".txt");
			FileReader fic = new FileReader(f);
			while((i=fic.read())!=-1) {
				contador++;			
				}
		
		}
	
		
	

		
		
		

		
	
		t_inicio = System.currentTimeMillis(); 
	
		t_fin = System.currentTimeMillis();
		

	}

}
