package com.junior.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o primeiro n�mero: ");
		int num1 = sc.nextInt();

		System.out.println("Entre com o segundo n�mero: ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("O n�mero " + num1 + " � maior que " + num2);
		} else if (num1 < num2) {
			System.out.println("O n�mero " + num2 + " � maior que " + num1);

		}

		sc.close();
	}
}
