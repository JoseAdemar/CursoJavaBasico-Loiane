package com.junior.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com um n�mero: ");
		int num = sc.nextInt();

		if (num >= 0) {
			System.out.println("O n�mero " + num + " � positivo");
		} else if (num < 0) {
			System.out.println("O n�mero " + num + " � negativo");

		}

		sc.close();
	}
}
