package com.junior.cursojava.aula17Exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean valido = false;

		double populacaoA = 0;
		double populacaoB = 0;

		int cont = 0;

		while (valido == false) {
			System.out.println("Entre com a população A");
			populacaoA = scanner.nextDouble();

			if (populacaoA > 0) {
				valido = true;
			} else {
				System.out.println("População A precisa ser maior que zero");
			}

		}

		valido = false;

		while (valido == false) {
			System.out.println("Entre com a população B");
			populacaoB = scanner.nextDouble();

			if (populacaoB > 0) {
				valido = true;
			} else {
				System.out.println("População B precisa ser maior que zero");
			}

		}
		valido = false;

		while (populacaoA < populacaoB) {

			populacaoA += (populacaoA / 100) * 3;
			populacaoB += (populacaoB / 100) * 1.5;

			cont++;
		}

		valido = false;

		System.out.println("População A: " + populacaoA);
		System.out.println("População B: " + populacaoB);
		System.out.println("Quantidade de anos: " + cont);

		scanner.close();
	}
}
