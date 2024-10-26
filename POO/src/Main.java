
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] Args) {
		Scanner scanner = new Scanner(System.in);
		Personas personas = new Personas();

		Auto auto = new Auto();
		auto.Encender();

		/*
		 * Pregunta 7: Polimorfismo hace que un objeto, y en concreto sub metodos, pueda
		 * sobre escribirse y tomar muchas formas. En cambio las sobre-cargas hace que
		 * una clase pueda tener varios metodos con el mismo nombre, con diferente tipo
		 * de argumento y puede tener varias entradas.
		 */

		Mascotas mascotas = new Mascotas();
		mascotas.SonidoMascota();

		PerroMascota perroMascota = new PerroMascota();
		perroMascota.SonidoMascota();

		GatoMascota gatoMascota = new GatoMascota();
		gatoMascota.SonidoMascota();

		Calculadora calculadora = new Calculadora();
		System.out.println("- El resultado de 1 + 1 es " + calculadora.Sumar(1, 1)); // Aquí se suma A + B
		System.out.println("- El resultado de 1 + 1 + 1 es " + calculadora.Sumar(1, 1, 1)); // Aquí se suma A + B + C"
		System.out.println("- El resultado de 1,1 + 1,1 + 1,1 es " + calculadora.Sumar(1.1, 1.1, 1.1)); // Aquí se suma
																										// A + B + C con
																										// coma
		PersonaPrivate persona = new PersonaPrivate();
		persona.personaPrivate();
		System.out.println(persona.personaPrivate("Julio", "Julián"));
		persona.saludar();
		persona.despedir();

		// Para eventos.
		EventsButton eventsbutton = new EventsButton();
		JButton jbutton = eventsbutton.Button();
		JFrame jframe = new JFrame("- Botón");

		jframe.add(jbutton);
		jframe.setSize(300, 200);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);

		/*
		 * Pregunta 4: Un objeto es una instancia de una clase con atributos y metodos
		 * (Línea 7).
		 */

		personas.name = "Juan";
		personas.edad = 25;

		System.out.print("+ Ingrese el nombre: ");
		personas.name = scanner.nextLine();
		System.out.print("+ Ingrese su edad: ");
		personas.edad = scanner.nextInt();

		personas.Saludar();

		System.out.println("Hola mundo.");

		eventsbutton.Button();
	}
}
