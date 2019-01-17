package P03_ComunicacionEnRed;



import java.io.IOException;

public class Ej_03_MulticastMain {

public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub

		//Emisor
		//Ej_03_MulticastEmisor emisor = new Ej_03_MulticastEmisor();	
		//emisor.multicast("Visca Barcaa");

		//Receptor
		Ej_03_MulticastReceptor receptor = new Ej_03_MulticastReceptor();
		receptor.start();	
	}
}


