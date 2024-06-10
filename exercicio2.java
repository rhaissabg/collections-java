package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int acharNumero, index = 0;
		boolean achou = false;

		numeros.addAll(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 20, 6));

		System.out.print("Digite o número que deseja encontrar: ");
		acharNumero = sc.nextInt();

		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) == acharNumero) {
				achou = true;
				index = i;
			}
		}

		if (achou) {
			System.out.printf("\nO número %d está localizado na posição %d", acharNumero, index);
		} else {
			System.out.printf("\nO número %d não foi encontrado!", acharNumero);
		}

		sc.close();

	}

}
