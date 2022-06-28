package com.junior.cursojava.aula17Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean informacaoInvalida = false;
		String nome;
		int idade;
		double salario;

		while (informacaoInvalida == false) {
			System.out.println("Entre com o nome: ");
			nome = scanner.next();

			if (nome.length() > 3) {
				informacaoInvalida = true;
			} else {
				System.out.println("Nome precisa de no mínimo 4 caracteres");
			}
		}

		informacaoInvalida = false; // reseta a variavel

		while (informacaoInvalida == false) {

			System.out.println("Entre com a idade: ");
			idade = scanner.nextInt();

			if (idade >= 0 && idade <= 150) {
				System.out.println("Idade válida");
				informacaoInvalida = true;
			} else {
				System.out.println("Idade precisa ser entre 0 e 150");
			}
		}

		informacaoInvalida = false; // reseta a variavel

		while (informacaoInvalida == false) {

			System.out.println("Entre com o salário: ");
			salario = scanner.nextDouble();

			if (salario > 0) {
				System.out.println("Salário válido");
				informacaoInvalida = true;
			} else {
				System.out.println("Salário precisa ser maior que 0");
			}
		}

		scanner.close();

	}
}
