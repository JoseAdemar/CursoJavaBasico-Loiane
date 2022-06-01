package com.junior.cursojava.aula13Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro: ");
		int num1 = sc.nextInt();
		
		System.out.println("Entre com um outro número inteiro: ");
		double num2 = sc.nextDouble();
		
		System.out.println("Entre com um número real: ");
		double num3 = sc.nextDouble();
		
		int resultado1 = (int) ((num1 * 2) * (num2 / 2));
		double resultado2 = (num1 * 3) + num3;
		double resultado3 = Math.pow(num3, 3);
		
		
		System.out.println("Resultado 1: " + resultado1);
		System.out.println("Resultado 2: " + resultado2);
		System.out.println("Resultado 3: " + resultado3);
		
		sc.close();

	}
}
