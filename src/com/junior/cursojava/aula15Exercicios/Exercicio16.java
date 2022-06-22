package com.junior.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor de A:");
		int a = sc.nextInt();

		if (a == 0) {
			System.out.println("Não é equação de segunda grau");
		} else {
			System.out.println("Informe o valor de B:");
			int b = sc.nextInt();

			System.out.println("Informe o valor de C:");
			int c = sc.nextInt();

			double delta = (b * b) - (4 * a * c);

			if (delta < 0) {
				System.out.println("Delta negativo");
			} else {
				double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

				System.out.println("Delta = " + delta);
				System.out.println("X1 = " + x1);
				System.out.println("X2 = " + x2);

			}
		}

		sc.close();
	}
}
