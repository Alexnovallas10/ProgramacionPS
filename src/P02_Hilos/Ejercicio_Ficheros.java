package P02_Hilos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio_Ficheros {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int x, contador=0;
		long t_inicio, t_fin;
		long tiempo_total;
		for(int i=1;i<=5;i++) {
			File f = new File("C:\\Users\\ifc\\git\\ProgramacionPS\\src\\P02_Hilos\\ficheros\\"+i+".txt");
			FileReader fic = new FileReader(f);
			while((x=fic.read())!=-1) {
				contador++;			
				}
			System.out.println("Fichero "+i+" :"+contador+" caracteres");
			fic.close();
		}
	
		t_inicio = System.currentTimeMillis(); 
		t_fin = System.currentTimeMillis();
		tiempo_total=t_fin - t_inicio;
		System.out.println("Tiempo: "+tiempo_total);

		

	}

}
