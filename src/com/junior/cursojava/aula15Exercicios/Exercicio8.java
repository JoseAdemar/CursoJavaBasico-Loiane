package com.junior.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Entre com o primeirao pre�o: ");
			double produto1 = sc.nextDouble();

			System.out.println("Entre com o segundo pre�o: ");
			double produto2 = sc.nextDouble();

			System.out.println("Entre com o terceiro pre�o: ");
			double produto3 = sc.nextDouble();

			if (produto1 < produto2 && produto1 < produto3) {
				System.out.println(produto1 + " � produto de menor pre�o");
			} else if (produto2 < produto1 && produto2 < produto3) {
				System.out.println(produto2 + " � produto de menor pre�o");

			} else if (produto3 < produto1 && produto3 < produto2) {
				System.out.println(produto3 + " � produto de menor pre�o");
			}
			
		} catch (Exception ex) {
			System.out.println("Numero inv�lido");
		}

		sc.close();
	}
}
