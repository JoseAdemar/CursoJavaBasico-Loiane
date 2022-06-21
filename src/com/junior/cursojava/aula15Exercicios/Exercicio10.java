package com.junior.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Digite o turno que você estuda: ");
			String turno = sc.nextLine();

			switch (turno) {
				case "m":
				case "M":
					System.out.println("Bom dia! ");
					break;

				case "v":
				case "V":
					System.out.println("Boa tarde!");
					break;

				case "n":
				case "N":
					System.out.println("Boa noite!");
					break;

				default: System.out.println("Turno inválido!");
					break;
			}
		} catch (Exception ex) {
			System.out.println("Turno inválido!");
		}

		sc.close();
	}
}
