package P02_Hilos;

public class EJ_5_Hilo4RunnableUsar {

	public static void main(String[] args) {
		Ej_5_Hilo4Runnable h4 = new Ej_5_Hilo4Runnable();
		Thread t = new Thread(h4);
		t.start();
		for(int i=0; i<5; i++)
			System.out.println("Soy la clase principal");

	}

}