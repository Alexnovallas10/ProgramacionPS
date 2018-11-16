package P02_Hilos;

public class Actividad_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actividad_2_tic h1 = new Actividad_2_tic();			
		h1.start();		
		Actividad_2_tac h2 = new Actividad_2_tac();			
		h2.start();		
	}
}