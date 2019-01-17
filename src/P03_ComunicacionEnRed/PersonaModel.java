package P03_ComunicacionEnRed;

import java.io.Serializable;

public class PersonaModel implements Serializable{
	
	String nombre;
	int edad;
	
	
	public PersonaModel (String nom, int e) {
		this.nombre=nom;
		this.edad=e;
		
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
	
	
	

}
