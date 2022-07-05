package com.junior.cursojava.aula19Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio9 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	double[] vetorA = new double[10];
	double[] vetorB = new double[vetorA.length];
	double[] vetorC = new double[vetorA.length];

	for (int i = 0; i < vetorA.length; i++) {

		System.out.println("Entre com a posição do vetorA: " + i);
		vetorA[i] = scanner.nextInt();

	}

	for (int i = 0; i < vetorA.length; i++) {

		System.out.println("Entre com a posição do vetorB: " + i);
		vetorB[i] = scanner.nextInt();

	}

	for (int i = 0; i < vetorC.length; i++) {

		System.out.println("Entre com a posição do vetorB: " + i);
		vetorC[i] = vetorA[i] / vetorB[i];

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
	
	DecimalFormat decimal = new DecimalFormat("###,###.###");

	System.out.print("Vetor C = ");
	for (int i = 0; i < vetorC.length; i++) {

		System.out.print(decimal.format(vetorC[i]) + " ");

	}

	scanner.close();
}
}
