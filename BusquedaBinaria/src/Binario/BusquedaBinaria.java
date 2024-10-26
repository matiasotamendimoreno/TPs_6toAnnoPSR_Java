package Binario;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BusquedaBinaria {
	private List<Integer> list;
	private int tamannoMaxAle;
	private int tamannoList;
	private Random rnd = new Random();
	
	public BusquedaBinaria() {
		list = new ArrayList<Integer>();
		tamannoMaxAle = 0;
		tamannoList = 0;
	}
	
	public void llenarArray() {
		for (int i = 0; i < tamannoList; i++) {
			list.add(i, rnd.nextInt(0, tamannoMaxAle));
		}
	}
	
	public void ordenarArray() {
		for (int i = 0; i <= list; i++) {
			for (int j = 0; j < i; i++) {
				
			}
		}
	}

	public void setMaxAleatorio(int maxAleatorio) {
		tamannoMaxAle = maxAleatorio;
	}
	
	public void setTamanoArray(int maxArray) {
		tamannoList = maxArray;
	}
}
