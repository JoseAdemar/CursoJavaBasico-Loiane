package com.junior.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o número: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impa");
		}

		sc.close();
	}
}
