package P03_ComunicacionEnRed;

import java.io.IOException;
import java.net.*;

public class Ej_03_MulticastEmisor {
    private DatagramSocket socket;
    private InetAddress grupo;
    private byte[] buf;
 
    public Ej_03_MulticastEmisor() {
    	
    }
    
    public void multicast(String multicastMessage) 
    		throws IOException {
        socket = new DatagramSocket();
        grupo = InetAddress.getByName("225.26.38.12");
        buf = multicastMessage.getBytes();
 
        DatagramPacket informacion = new DatagramPacket(buf, buf.length, grupo, 9999);
        socket.send(informacion);
        socket.close();
    }
}