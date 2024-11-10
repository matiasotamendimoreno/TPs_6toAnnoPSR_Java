package clases;

import java.util.ArrayList;

public class Alumno extends Persona {
    private int legajo;
    private ArrayList<Integer> notas;

    public Alumno(String nombre, String mail, String dni, int legajo) {
        super(nombre, mail, dni);
        this.legajo = legajo;
        this.notas = new ArrayList<>();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void agregarNota(int nota) {
        this.notas.add(nota);
    }

    public double getPromedio() {
        if (notas.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }
}

