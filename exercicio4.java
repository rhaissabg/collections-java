package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> setNumeros = new HashSet<Integer>();
		int acharNumero;
		boolean achou = false;

		setNumeros.addAll(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));

		System.out.print("Digite o número que deseja encontrar: ");
		acharNumero = sc.nextInt();

		for (int numero : setNumeros) {
			if (numero == acharNumero) {
				achou = true;
			}
		}

		if (achou) {
			System.out.printf("\nO número %d foi encontrado!", acharNumero);
		} else {
			System.out.printf("\nO número %d não foi encontrado!", acharNumero);
		}

		sc.close();

	}

}
