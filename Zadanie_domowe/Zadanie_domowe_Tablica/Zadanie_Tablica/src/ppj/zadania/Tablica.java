package ppj.zadania;

import java.util.Arrays;
import java.util.Scanner;

public class Tablica {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Podaj wartosc parametru n: ");

		int n = Integer.parseInt(input.next());

		if (n <= 0) {
			System.out.println("Parametr nie może być < lub = od 0!!!");
		} else {

			System.out.println();

			int[][] tab = new int[n + 1][];

			for (int j = 0; j <= n; j++) {

				tab[j] = new int[j + 1];

				for (int k = 0; k <= j; k++) {

					tab[j][k] = k;

					System.out.print(tab[j][k] + " ");

				}

				System.out.println();

			}

			System.out.println();
			input.close();
		}

	}

}
