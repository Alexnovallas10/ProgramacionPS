package P02_Hilos;

public class Actividad_2_tic extends Thread {

	
	public Actividad_2_tic() {}
	
	// método run
	public void run() {
		for(;;) {
			System.out.println(" tic ");
				try {
					Thread.sleep(1000);
					} catch (InterruptedException ex) {			  
			}
		}			
	}
}
