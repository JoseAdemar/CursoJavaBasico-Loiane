package com.junior.cursojava.aula19Exercicios;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com a posi��o do vetorA: " + i);
			vetorA[i] = scanner.nextInt();

			vetorB[i] = vetorA[i] % 2;

		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {

			System.out.print(vetorA[i] + " ");

		}
		System.out.println();

		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {

			System.out.print(vetorB[i] + " ");

		}

		scanner.close();
	}
}
