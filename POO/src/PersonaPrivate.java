
public class PersonaPrivate implements PersonasInterface {
	private String nombre;
	private String apellido;

	public void personaPrivate() {
		System.out.println("- Persona privada 👔");
	}

	public String personaPrivate(String nombre, String apellido) {
		return "- Nombre: " + nombre + " | Apellido: " + apellido;
	}

	@Override
	public void saludar() {
		System.out.println("- Buenos días.");
	}

	@Override
	public void despedir() {
		System.out.println("- Adiós.");
	}

	/*
	 * Interface: Es un contrato de metodos abstractos para implementar en una clase.
	 * 
	 * Encapsulamiento: Sirve para restringir atributos y metodos dentro de una
	 * clase. Y solamente puede ser modificada y controlada dentro de esa clase. Con
	 * esto nos aseguramos la protección de los datos y su gestionamiento.
	 */
}
