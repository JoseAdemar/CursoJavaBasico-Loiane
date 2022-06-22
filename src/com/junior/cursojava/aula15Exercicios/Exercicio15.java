package com.junior.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o lado 1: ");
		int lado1 = sc.nextInt();

		System.out.println("Entre com o lado 2: ");
		int lado2 = sc.nextInt();

		System.out.println("Entre com o lado 3: ");
		int lado3 = sc.nextInt();

		if (((lado1 + lado2) > lado3 || ((lado1 + lado3)) > lado2) || ((lado2 + lado3) > lado1)) {

			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("Tri�ngulo Equil�tro");
			} else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
				System.out.println("Tri�ngulo Escaleno");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Tri�ngulo Is�celes");
			}
		}else {
			System.out.println("N�o forma um triangulo");
		}

		sc.close();
	}
}
