package com.junior.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com uma letra ( F ou M ) ");
		String input = sc.next();

		if (input.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
		} else if (input.equalsIgnoreCase("m")) {
			System.out.println("Masculino");

		} else {
			System.out.println("Sexo inválido");
		}

		sc.close();
	}
}
