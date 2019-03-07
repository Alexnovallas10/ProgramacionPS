package Ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {	
		String t[] = { "os.name", "os.version",  "os.arch",
					"line.separator", "path.separator",
					"user.dir", "user.home", "user.name",
					"java.class.path", "java.home", 
					"java.vendor", "java.version" };
		
		//SecurityManager sm = new SecurityManager();
		//System.setSecurityManager(sm);
        
		for (int i = 0; i < t.length; i++) {
			System.out.print("Property:" + t[i]);
			try {
				String s = System.getProperty(t[i]);
				System.out.println("\t==> " + s);
			} catch (Exception e) {
				System.err.println("\n\tException " + e.toString());
			}
		}
	}
}





/*java -classpath "C:\Users\ifc\git\ProgramacionPS\bin\Ejercicio2"
	-Djava.security.manager 
-Djava.security.policy="C:\Users\ifc\git\ProgramacionPS\bin\Ejercicio2\Ficheros\Politica.policy"
-Dfile.encoding=UTF-8 -classpath "C:\Users\ifc\git\ProgramacionPS\bin\Ejercicio2\Ejercicio2.class"*/