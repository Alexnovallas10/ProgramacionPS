package P02_Hilos;

public class Ej_13_Productor extends Thread {
	    private EJ_13_Cola cola;
	    private int n;

	    public Ej_13_Productor(EJ_13_Cola c, int n) {
	        cola = c;
	        this.n = n;
	    }

	    public void run() {
	        for (int i = 0; i < 5; i++) {
	            cola.put(i); //pone el n�mero
	            System.out.println(i + "=>Productor : " + n
	                               + ", produce: " + i);
	            try {
	                sleep(100);
	            } catch (InterruptedException e) { }			
				
	        }
	    }
	}
