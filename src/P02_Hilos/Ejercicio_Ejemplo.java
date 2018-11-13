package P02_Hilos;

public class Ejercicio_Ejemplo extends Thread {

	// constructor
	public Ejercicio_Ejemplo(String nombre) {
		super(nombre);
	}

	// método run
	public void run() {
			System.out.println("Hola mundo:  " +this.getId()+"    "+this.getName());
	}

	//
	public static void main(String[] args) {
		Ejercicio_Ejemplo h1 = new Ejercicio_Ejemplo("Hilo 1");
		Ejercicio_Ejemplo h2 = new Ejercicio_Ejemplo("Hilo 2");
		Ejercicio_Ejemplo h3 = new Ejercicio_Ejemplo("Hilo 3");
		Ejercicio_Ejemplo h4 = new Ejercicio_Ejemplo("Hilo 4");
		Ejercicio_Ejemplo h5 = new Ejercicio_Ejemplo("Hilo 5");
			
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
		
		System.out.println("5 HILOS INICIADOS...");
	}// main
	

}
