package com.junior.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o primeiro número: ");
		int num1 = sc.nextInt();

		System.out.println("Entre com o segundo número: ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("O número " + num1 + " é maior que " + num2);
		} else if (num1 < num2) {
			System.out.println("O número " + num2 + " é maior que " + num1);

		}

		sc.close();
	}
}
