package com.junior.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Entre com o primeirao n�mero: ");
			Integer num1 = sc.nextInt();

			System.out.println("Entre com o segundo n�mero: ");
			Integer num2 = sc.nextInt();

			System.out.println("Entre com o terceiro n�mero: ");
			Integer num3 = sc.nextInt();

			if (num1 < num2 && num1 < num3) {
				System.out.println(num1 + " � menor ");
			} else if (num2 < num1 && num2 < num3) {
				System.out.println(num2 + " e menor");

			} else if (num3 < num1 && num3 < num2) {
				System.out.println(num3 + " � menor");
			}
			if (num1 > num2 && num1 > num3) {
				System.out.println(num1 + " � maior ");
			} else if (num2 > num1 && num2 > num3) {
				System.out.println(num2 + " e maior");

			} else if (num3 > num1 && num3 > num2) {
				System.out.println(num3 + " � maior");
			}
		} catch (Exception ex) {
			System.out.println("Numero inv�lido");
		}

		sc.close();
	}
}
