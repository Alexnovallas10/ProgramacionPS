package P02_Hilos;

public class Ej_13_Consumidor extends Thread {
	
	    private EJ_13_Cola cola;
	    private int n;

	    public Ej_13_Consumidor(EJ_13_Cola c, int n) {
	        cola = c;
	        this.n = n;
	    }

	    public void run() {
	        int valor = 0;
	        for (int i = 0; i < 5; i++) {
	            valor = cola.get(); //recoge el número
	            System.out.println(i + "=>Consumidor: " + n
	                               + ", consume: " + valor);
	        }
	    }
	}