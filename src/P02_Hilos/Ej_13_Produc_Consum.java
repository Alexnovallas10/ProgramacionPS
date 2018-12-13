package P02_Hilos;

public class Ej_13_Produc_Consum {

		  public static void main(String[] args) {  
			  EJ_13_Cola cola = new EJ_13_Cola();
			
			  Ej_13_Productor p = new Ej_13_Productor(cola, 1);	
			  Ej_13_Consumidor c = new Ej_13_Consumidor(cola, 1);
			
		    p.start();
			c.start();

		  }
		}