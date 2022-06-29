package com.junior.cursojava.aula17Exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int populacaoA = 80000;
		int populacaoB = 200000;

		int cont = 0;

		while (populacaoA < populacaoB) {

			populacaoA += (populacaoA / 100) * 3;
			populacaoB += (populacaoB / 100) * 1.5;

			cont++;
		}

		System.out.println("População A: " + populacaoA);
		System.out.println("População B: " + populacaoB);
		System.out.println("Quantidade de anos: " + cont);
		scanner.close();
	}
}
