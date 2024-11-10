package clases;

import java.util.ArrayList;
import java.util.Random;

public class ListaAleatoria {
    private ArrayList<Integer> listaNumeros;

    public ListaAleatoria() {
        listaNumeros = new ArrayList<>();
        generarNumerosAleatorios();
    }

    private void generarNumerosAleatorios() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            listaNumeros.add(random.nextInt(99) + 1);
        }
    }

    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public boolean buscarNumero(int numero) {
        return listaNumeros.contains(numero);
    }
}

