package P02_Hilos;

public class Ej_9_hilosPrioaridad1 extends Thread {

	public static void main(String args[]) {    
		Ej_9_HiloPrioridad h1 = new Ej_9_HiloPrioridad("Hilo1");
		Ej_9_HiloPrioridad h2 = new Ej_9_HiloPrioridad("Hilo2");
		Ej_9_HiloPrioridad h3 = new Ej_9_HiloPrioridad("Hilo3");	
		  
		h1.setPriority(Thread.NORM_PRIORITY);
		h2.setPriority(Thread.MAX_PRIORITY);    
		h3.setPriority(Thread.MIN_PRIORITY);   
		
		h1.start();	
		h2.start();
	    h3.start();  	

	   try {
	      Thread.sleep(10000);
	    } catch (Exception e) { }


	    h1.pararHilo();
	    h2.pararHilo();
		h3.pararHilo();
		
	    System.out.println("h2 (Prioridad Maxima): " + h2.getContador());
		System.out.println("h1 (Prioridad Normal): " + h1.getContador());  	
		System.out.println("h3 (Prioridad Minima): " + h3.getContador());

	  }
}