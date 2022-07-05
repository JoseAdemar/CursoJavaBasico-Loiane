package com.junior.cursojava.aula19Exercicios;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double[] vetorA = new double[4];
		double[] vetorB = new double[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com a posição: " + i);
			vetorA[i] = scanner.nextInt();

			vetorB[i] = Math.sqrt(vetorA[i]);

		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {

			System.out.print(vetorA[i] + " ");

		}
		System.out.println();

		DecimalFormat decimal = new DecimalFormat("###,###.###");

		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {

			System.out.printf(decimal.format(vetorB[i]) + " ");

		}

		scanner.close();
	}
}
