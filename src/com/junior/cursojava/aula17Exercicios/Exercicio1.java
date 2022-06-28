package com.junior.cursojava.aula17Exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean notaValida = false;

		do {
			System.out.println("Informe a nota: ");
			double nota = sc.nextDouble();

			if (nota >= 0 && nota <= 10) {
				System.out.println("Você digitou a nota: " + nota);
				notaValida = true;
			} else {
				System.out.println("Nota inválida, digite outra nota: ");

			}
		} while (notaValida == false);

		sc.close();
	}
}
