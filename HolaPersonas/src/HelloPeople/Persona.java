package HelloPeople;

public class Persona {
	private String nombre;
	private int edad;
	
	// Constructores:
	// Nombre y edad.
	public Persona (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	// Nombre y edad
	public void ActualizarNombreYEdad (String nombre, int edad) {
		setNombre(nombre);
		setEdad(edad);
	}
	
	// Nombre:
	public void ActualizarNombre (String nombre) {
		setNombre(nombre);
	}
	
	// Edad:
	public void ActualizarEdad (int edad) {
		setEdad(edad);
	}
	
	public Persona() {
	}

	// Getters:
	public String getNombre () {
		return nombre;
	}
	
	public int getEdad () {
		return edad;
	}
	
	// Setters:
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad (int edad) {
		this.edad = edad;
	}
}
