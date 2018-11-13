package P02_Hilos;

public class Ej4_Hilo3Thread extends Thread {

	public void run() {
		System.out.println("Informacion del hilo: " + Thread.currentThread().toString());

		for (int i = 0; i < 1000; i++)
			i++;

		System.out.println(Thread.currentThread().getName() + " Finalizando la ejecución.");
	}

	
	public static void main(String[] args) {

		Thread.currentThread().setName("Principal");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().toString());

		ThreadGroup grupo = new ThreadGroup("Grupo de hilos");
		Ej4_Hilo3Thread h = new Ej4_Hilo3Thread();

		Thread h1 = new Thread(grupo, h, "Hilo 1");
		Thread h2 = new Thread(grupo, h, "Hilo 2");
		Thread h3 = new Thread(grupo, h, "Hilo 3");		

		h1.start();
		h2.start();
		h3.start();

		System.out.println("3 HILOS CREADOS...");
		System.out.println("Hilos activos: " + Thread.activeCount());
	}//
}