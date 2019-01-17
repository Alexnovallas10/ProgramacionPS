package P03_ComunicacionEnRed;

import java.io.IOException;
import java.net.*;

//Cliente que escucha hasta que llega la cadena fin.
public class Ej_03_MulticastReceptor extends Thread {

protected MulticastSocket socket = null;
protected byte[] buf = new byte[256];

	public Ej_03_MulticastReceptor() {

	}

	public void run() {
    
    try {
    	socket = new MulticastSocket(9999);
    	InetAddress grupoMulticast = InetAddress.getByName("225.26.38.10");
    	socket.joinGroup(grupoMulticast);
    
   while (true) {
        
       DatagramPacket informacion = new DatagramPacket(buf, buf.length);
       socket.receive(informacion);
       String recibido = new String(informacion.getData(), 0, informacion.getLength());
       System.out.println(recibido);
       
       if ("fin".equals(recibido)) {
           break;
       }
   }
   socket.leaveGroup(grupoMulticast);
   socket.close();
    	} catch (IOException e) {
    			// TODO Auto-generated catch block
    		e.printStackTrace();
    	}	    
	}
}