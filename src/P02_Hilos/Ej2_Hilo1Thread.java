package P02_Hilos;

public class Ej2_Hilo1Thread extends Thread {

			// constructor
			public Ej2_Hilo1Thread(String nombre) {
				super(nombre);
				System.out.println("CREANDO HILO:" + getName());
			}

			// método run
			public void run() {
				for (int i=0; i<5; i++) 
					System.out.println("Hilo:" + getName() + " C = " + i);
			}

			//
			public static void main(String[] args) {
				Ej2_Hilo1Thread h1 = new Ej2_Hilo1Thread("Hilo 1");
				Ej2_Hilo1Thread h2 = new Ej2_Hilo1Thread("Hilo 2");
				Ej2_Hilo1Thread h3 = new Ej2_Hilo1Thread("Hilo 3");
					
				h1.start();
				h2.start();
				h3.start();
				
				System.out.println("3 HILOS INICIADOS...");
			}// main
			
		
	}
