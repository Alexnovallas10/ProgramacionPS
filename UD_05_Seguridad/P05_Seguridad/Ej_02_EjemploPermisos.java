package P05_Seguridad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ej_02_EjemploPermisos {
     
      public static void main(String[] args) {
           
            //El directorio C:/Ficheros debe estar creado previamente.
            System.setProperty ("java.security.policy", System.getProperty("user.dir") + "UD_05_Seguridad\\P05_Seguridad\\Ficheros\\Politica2.policy");
            System.setSecurityManager(new SecurityManager());
            try {
                  //escritura en fichero
                  BufferedWriter fichero = new BufferedWriter (new FileWriter("C://Users//ifc//git//ProgramacionPS//UD_05_Seguridad//P05_Seguridad//Ficheros//Fichero.txt"));
                  fichero.write("Escritura de una linea en fichero.");
                  fichero.newLine(); // escribe un salto de línea
                  fichero.close();
                  System.out.println("Final proceso de escritura...");
                 
                  //lectura del fichero
                  BufferedReader fichero2 = new BufferedReader (new FileReader("C://Users//ifc//git//ProgramacionPS//UD_05_Seguridad//P05_Seguridad//Ficheros//Fichero.txt"));
                  String linea = fichero2.readLine();
                  System.out.println("Contenido del fichero: ");
                  System.out.println("\t" + linea);
                  fichero2.close();
                  System.out.println("Final proceso de lectura...");
            } catch (FileNotFoundException fn) {
                  System.out.println("No se encuentra el fichero");
            } catch (IOException io) {
                  System.out.println("Error de E/S ");
            } catch (Exception e) {
                  System.out.println("ERROR => " + e.toString());
            }//Fin de try
           
      }// Fin de main   
}// Fin de Ejemplo2
