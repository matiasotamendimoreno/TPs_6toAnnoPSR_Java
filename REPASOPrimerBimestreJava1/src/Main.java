import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayDeNumeros = Generador(100);
		
		int numeroABuscar = 0;
		
		System.out.println("| Hola mundo.");
		System.out.println(TablaDelSiete());

		System.out.print("| Numero a encontrar en un array de 100 casillas entre el 0 y el 99 (True o False): ");
		numeroABuscar = scanner.nextInt();
		System.out.println(arrayDeNumeros);
		System.out.println(BuscandoEnArrayDeNumeros(numeroABuscar, arrayDeNumeros));
		
	}
	
	public static String TablaDelSiete() {
		String aRetornar = "";
		
		for (int i = 0; i <= 10; i++) {
			 aRetornar += "| 7 x " + i + " = " +  (i * 7) + "\n";
		}
		
		return aRetornar;
	}
	
	public static ArrayList<Integer> Generador(int tope) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < tope; i++) {
            lista.add(rand.nextInt(10));
        }

        return lista;
    }
	
	public static boolean BuscandoEnArrayDeNumeros(int numeroABuscar, ArrayList<Integer> arrayDeNumeros) {
		// System.out.println(numeroABuscar);
		boolean encontrado = false;
		
		for (Integer number: arrayDeNumeros) {
			if (number.equals(numeroABuscar)) {
				encontrado = true;
			} else {
				
			}
		}
		
		return encontrado;
	}
}
