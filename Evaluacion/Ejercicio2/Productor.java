package Ejercicio2;

import java.io.File;
import java.io.FileReader;

public class Productor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  private Cola cola;
		    private int n;

		    public Productor(Cola c, int n) {
		        cola = c;
		        this.n = n;
		    }

		    public void run() {
		    	
		    File f1 = new File("./ej_2.txt");				
			FileReader fichero = new FileReader(f1);
			
			
			char b[] = new char[30];
			
			int i;
			while((i=fichero.read(b))!=-1) {
				System.out.print(b);
			}	
			fichero.close();
		      
		    }

			
}