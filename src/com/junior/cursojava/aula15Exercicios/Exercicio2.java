package com.junior.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com um número: ");
		int num = sc.nextInt();

		if (num >= 0) {
			System.out.println("O número " + num + " é positivo");
		} else if (num < 0) {
			System.out.println("O número " + num + " é negativo");

		}

		sc.close();
	}
}
