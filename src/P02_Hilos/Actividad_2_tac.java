package P02_Hilos;

public class Actividad_2_tac extends Thread {

	public Actividad_2_tac() {}
	
	
	public void run() {
		for(;;) {
			System.out.println(" tac ");
				try {
					Thread.sleep(1000);
					} catch (InterruptedException ex) {			  
			}
		}			
	}
}