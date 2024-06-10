package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.printf("Digite a %dª cor: ", (i + 1));
			cores.add(sc.next());
		}

		System.out.println("\nLista de todas as cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}

		cores.sort(null);

		System.out.println("\nLista de cores ordenadas: ");
		for (String cor : cores) {
			System.out.println(cor);
		}

		sc.close();

	}

}
