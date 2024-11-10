package clases;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Hola Mundo");

       
        TablaDelSiete tablaDelSiete = new TablaDelSiete();
        tablaDelSiete.imprimirTablaDelSiete();

        
        ListaAleatoria listaAleatoria = new ListaAleatoria();
        ArrayList<Integer> listaNumeros = listaAleatoria.getListaNumeros();

        
        System.out.println("\nlista de 100 números aleatorios:");
        System.out.println(listaNumeros);

        
        int numeroBuscado = 50;
        if (listaAleatoria.buscarNumero(numeroBuscado)) {
            System.out.println("\nel número " + numeroBuscado + " se encontró en la lista.");
        } else {
            System.out.println("\nel número " + numeroBuscado + " no se encontró en la lista.");
        }

       
        Persona persona = new Persona("Juan Pérez", "juan@mail.com", "12345678");
        System.out.println("\ninformación de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Mail: " + persona.getMail());
        System.out.println("DNI: " + persona.getDni());

        
        Alumno alumno = new Alumno("Ana García", "ana@mail.com", "87654321", 12345);

        
        alumno.agregarNota(85);
        alumno.agregarNota(90);
        alumno.agregarNota(78);
        alumno.agregarNota(92);

        
        System.out.println("\nnotas del alumno:");
        System.out.println(alumno.getNotas());

        double promedio = alumno.getPromedio();
        System.out.println("promedio de notas: " + promedio);
    }
}

