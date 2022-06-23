package com.junior.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de (kg) de morango: ");
		double morango = sc.nextDouble();

		System.out.println("Informe a quantidade de (kg) de maçã: ");
		double maca = sc.nextDouble();

		double precoPorKiloMorango = 0;

		if (morango <= 5) {
			precoPorKiloMorango = 2.5;
		} else {
			precoPorKiloMorango = 2.2;
		}

		double precoPorKiloMaca = 0;
		if (maca <= 5) {
			precoPorKiloMaca = 1.8;
		} else {
			precoPorKiloMaca = 1.5;
		}

		double precoTotalMorango = morango * precoPorKiloMorango;
		double precoTotalMaca = maca * precoPorKiloMaca;

		double precoParcial = precoPorKiloMorango + precoPorKiloMaca;
		double precoTotal = precoParcial;

		if ((morango + maca > 8) || precoParcial > 25) {
			precoTotal = precoParcial - ((precoParcial / 100 * 10));
		}
		
		System.out.println("Preço total = " + precoTotal);

		sc.close();
	}
}
