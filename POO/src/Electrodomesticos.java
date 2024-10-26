
public class Electrodomesticos {
	private String nombre;
	private float precio;
	private String marca;

	public Electrodomesticos(String nombre, float precio, String marca) {
		this.nombre = nombre;
		this.precio = precio;
		this.marca = marca;
	}

	public String getNombre() {
		return nombre;
	}

	public String setNombre(String nombre) {
		return this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public float setPrecio(float precio) {
		return this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public String setMarca(String marca) {
		return this.marca = marca;
	}

	/*
	 * Constructor: Es un bloque de código que se ejecuta cuando se crea una instancia de una clase. Tiene como proposito principal
	 * inicializar los objetos de esa clase (Es decir asignar valores iniciales a los atributos de ese objeto).
	 */
}
