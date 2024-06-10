package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> setValores = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %dº valor: ", (i + 1));
			setValores.add(sc.nextInt());
		}

		Iterator<Integer> iValores = setValores.iterator();

		System.out.println("\nLista de dados do Set: ");
		while (iValores.hasNext()) {
			System.out.println(iValores.next());
		}

		sc.close();

	}

}
