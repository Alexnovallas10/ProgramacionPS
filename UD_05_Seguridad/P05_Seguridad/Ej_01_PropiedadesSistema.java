package P05_Seguridad;

public class Ej_01_PropiedadesSistema {

	public static void main(String[] args) {	
		String t[] = { "os.name", "os.version", 
					"user.dir", "user.home", "user.name",
					"java.class.path", "java.home", 
					"java.vendor", "java.version"};
        
		for (int i = 0; i < t.length; i++) {
			System.out.print("Propiedad:" + t[i]);
			try {
				String s = System.getProperty(t[i]);
				System.out.println("\t==> " + s);
			} catch (Exception e) {
				System.err.println("\n\tExcepción " + e.toString());
			}
		}
	}
}