package P02_Hilos;

public class Ej1_hiloThread extends Thread{
		
		private int x;

		Ej1_hiloThread(int x) {
			this.x = x;
		}

		public void run() {
			for (int i = 0; i < x; i++)
				System.out.println("En el Hilo... " + i);
		}

		public static void main(String[] args) {
			Ej1_hiloThread p = new Ej1_hiloThread(5);
			p.start();
		}// main
	}