package P03_ComunicacionEnRed;

import java.io.IOException;
import java.io.InputStream;
//libreria java para comunicacion en red
import java.net.*;

public class Ejemplojavanet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InetAddress ip = null;
		ip = InetAddress.getByName(args[0]);
		System.out.println("Direccion: "+ip);

		//ip = InetAddress.getLocalHost();
		//System.out.println(ip);
		
		System.out.println("Direccion ip: "+ip.getHostAddress());
		System.out.println("Direccion: "+ip.getHostName());
		System.out.println("Nombre equipo: "+ip.getCanonicalHostName());



		URL url = new URL("https://www.google.com:443");
		url.openStream();
		InputStream is = url.openStream();
		URLConnection con = url.openConnection();

	}

}
