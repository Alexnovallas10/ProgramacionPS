package P02_Hilos;

public class Ej_9_HiloPrioridad extends Thread {

	  private int c = 0;
	  private boolean stopHilo= false; 
	  
	  public Ej_9_HiloPrioridad(String nombre) {
			super(nombre);		
	  }
	  public int getContador()  {
	         return c;
	  }  
	  public void pararHilo()  {
	          stopHilo = true;         
	  }  
	  public void run() {
	    while (!stopHilo) {
	    	try {
	    	      Thread.sleep(2);
	    	    } catch (Exception e) { }
	    	c++;      	
	    } 
	    System.out.println("Fin hilo  " + this.getName());
		
	  }
}