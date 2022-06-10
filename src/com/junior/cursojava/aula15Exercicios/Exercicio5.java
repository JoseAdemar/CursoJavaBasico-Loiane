package com.junior.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a primeira nota: ");
		double nota1 = sc.nextDouble();

		System.out.println("Entre com a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;

		if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");

		}
		
		System.out.println("Sua média é: " + media);

		sc.close();
	}
}
