package com.junior.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o primeiro n�mero: ");
		int num1 = sc.nextInt();

		System.out.println("Entre com o segundo n�mero: ");
		int num2 = sc.nextInt();

		System.out.println("Entre com a opera��o ( + - / * ) ");
		String operacao = sc.next();

		double resultado = 0.0;
		boolean valida = true;

		switch (operacao) {
			case "+":
				resultado = num1 + num2;
				break;
			case "-":
				resultado = num1 - num2;
				break;
			case "/":
				resultado = num1 / num2;
				break;
			case "*":
				resultado = num1 * num2;
				break;

			default:
				System.out.println("Opera��o inv�lida");
				valida = false;
				break;
		}

		if (valida) {

			if (resultado >= 0) {
				System.out.println("RESULTADO POSITIVO");
			} else {
				System.out.println("RESULTADO NEGATIVO");
			}

			if (resultado % 2 == 0) {
				System.out.println("Resultado par");
			} else {
				System.out.println("Resultado impa");
			}
		}

		sc.close();
	}
}
