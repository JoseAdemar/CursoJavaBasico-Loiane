package com.junior.cursojava.aula18BreakContinue;

import java.util.Scanner;

public class BreakContinue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com um número: ");
		int numero = scanner.nextInt();

		System.out.println("Entre com um limite: ");
		int maximo = scanner.nextInt();

		for (int i = numero; i <= maximo; i++) {

			if (i % 7 == 0) {

				System.out.println("O valor de I É: " + i);
				// continue;
				break;
			}

		}

		scanner.close();
	}
}
