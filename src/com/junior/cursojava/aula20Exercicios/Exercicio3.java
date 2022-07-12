package com.junior.cursojava.aula20Exercicios;

import java.util.Scanner;
/**
 *  Programa mostra os numeros pares e impar de uma matriz
 */
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] numeros = new int[3][3];

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {

				System.out.println("Entre com o valor da posiçao[" + i + "," + j + "]");
				numeros[i][j] = sc.nextInt();
			}
		}

		int quantidadesPares = 0;
		int quantidadesImpares = 0;

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {

				if (numeros[i][j] % 2 == 0) {
					quantidadesPares++;
				} else {
					quantidadesImpares++;
				}
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {

				System.out.print(numeros[i][j] + "---");
				
			}
			System.out.println();
		}

		System.out.println("Quantidade pares = " + quantidadesPares);
		System.out.println("Quantidade impares = " + quantidadesImpares);
		sc.close();
	}
}
