package com.junior.cursojava.aula20Exercicios;

import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {
		int[][] numerosAleatorios = new int[10][10];

		Random numeroRandom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {

				numerosAleatorios[i][j] = numeroRandom.nextInt(100);

				System.out.print(numerosAleatorios[i][j] + "---");
			}
			
			System.out.println();
		}

		int mairorLinha5 = 5;
		int menorLinha5 = 101;
		int linha5 = 5;

		for (int i = 0; i < numerosAleatorios[5].length; i++) {

			if (numerosAleatorios[5][i] > mairorLinha5) {
				mairorLinha5 = numerosAleatorios[linha5][i];
			}

			if (numerosAleatorios[5][i] < menorLinha5) {
				menorLinha5 = numerosAleatorios[5][i];
			}

		}

		System.out.println("Maior valor da linha 5 = " + mairorLinha5);
		System.out.println("Menor valor da linha 5 = " + menorLinha5);

		int mairorColuna7 = 0;
		int menorColuna7 = 101;
		int coluna7 = 7;

		for (int i = 0; i < numerosAleatorios[5].length; i++) {

			if (numerosAleatorios[i][coluna7] > mairorColuna7) {
				mairorColuna7 = numerosAleatorios[i][coluna7];
			}

			if (numerosAleatorios[i][coluna7] < menorColuna7) {
				menorColuna7 = numerosAleatorios[i][coluna7];
			}

		}

		System.out.println("Maior valor da coluna 7 = " + mairorLinha5);
		System.out.println("Menor valor da coluna 7 = " + menorLinha5);

	}
}
