package P01_Procesos;

import java.io.InputStream;

/*public class Lanzador2 {

	public void lanzarSumador(Integer n1, Integer n2){
	    String clase="com.creacion.Sumador";
	    ProcessBuilder pb;
	    try {
	        pb = new ProcessBuilder(
                    "java",
                    clase,
                    n1.toString(),
                    n2.toString()
            );
	        pb.start();
	        
	        try {
	        	InputStream is = pb.getInputStream();
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
		    	valorSalida = pb.waitFor();
		    	System.out.print("Valor de salida: " + valorSalida);
		    }catch (Exception e) {
		        e.printStackTrace();
		    }
		    
		    
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void main(String[] args){
	    Lanzador2 l=new Lanzador2();
	    l.lanzarSumador(1, 51);
	    l.lanzarSumador(51, 100);
	    System.out.println("Sumas realizadas con �xito");
	}

}*/
	
