package HelloPeople;

public class Main {
	public static void main(String[] Args) {
		HolaMundo holamundo = new HolaMundo();
		
		System.out.println(holamundo.HelloWorld());
		
		Persona persona = new Persona("Matías", 18);
		// Metodo 1
		persona.ActualizarNombre("Matías");
		persona.ActualizarEdad(18);
		System.out.println("- Esta persona tiene por Nombre " + persona.getNombre() + " y Edad " + persona.getEdad() + ".");
		// Metodo 2
		persona.ActualizarNombreYEdad("", 0);
		System.out.println("- Esta persona tiene por Nombre " + persona.getNombre() + " y Edad " + persona.getEdad() + ".");
	}
}
