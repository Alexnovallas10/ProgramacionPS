package P01_Procesos;

public class Sumador {
				
	/**
	 * suma todos los numeros desde el menor introducido hasta el maximo inroducido
	 * @param n1 primer numero Integer
	 * @param n2 segundo nuemro Integer
	 * @return resultado Integer
	 */
		 public int sumar(int n1, int n2){
	            int resultado=0;
	            for (int i=n1;i<=n2;i++){
	                    resultado=resultado+i;
	            }
	            // System.out.println(resultado);
	            return resultado;
	    }
	    
	    
	    public static void main(String[] args){
	            Sumador s=new Sumador();
	            int n1=Integer.parseInt(args[0]);
	            int n2=Integer.parseInt(args[1]);	           
	            int resultado=s.sumar(n1, n2);
	            System.out.println("Suma de todos los numeros: "+resultado);
	    }
	}