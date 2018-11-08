package P01_Procesos;

import java.io.InputStream;

public class Ejercicio_1_2 {

	public void lanzarSumador(Integer n1, Integer n2){
	    String clase="com.creacion.Sumador";
	    Process p;
	    try {
	        p = new ProcessBuilder(
                    "java",
                    clase,
                    n1.toString(),
                    n2.toString()
            ).start();
	        //pb.start();
	        
	        try {
	        	InputStream is = p.getInputStream();
	        	int c;
	        	
	        	while ((c = is.read()) != -1)
	        		System.out.print((char) c);
	        	is.close();
	        }catch (Exception e) {
		        e.printStackTrace();
		    }
		    
		    
		    // Comprobar si el proceso ha finalizado de forma correcta
		    //  0 Bien
		    // -1 Mal 
		    
		    int valorSalida;
		    
		    try {
		    	valorSalida = p.waitFor();
		    	System.out.println("Valor de salida: " + valorSalida);
		    }catch (Exception e) {
		        e.printStackTrace();
		    }
		    
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void main(String[] args){
		Ejercicio_1_2 l=new Ejercicio_1_2();
	    l.lanzarSumador(1, 51);
	    l.lanzarSumador(51, 100);
	    System.out.println("Sumas realizadas con éxito");
	}

}