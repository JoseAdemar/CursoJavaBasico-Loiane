package com.junior.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de litros: ");
		int litros = sc.nextInt();

		System.out.println("Informe o tipo de combustivel: ");
		String tipoCombustivel = sc.next();

		double precoGasolina = 2.5;
		double precoAlcoo = 1.9;
		int percentualDesconto = 0;
		double total = 0;
		double totalDesconto = 0;

		if (tipoCombustivel.equalsIgnoreCase("alcool")) {
			if (litros <= 20) {
				percentualDesconto = 3;
			} else {
				percentualDesconto = 5;
			}
			total = litros * precoAlcoo;
		} else if (tipoCombustivel.equalsIgnoreCase("Gasolina")) {
			if (litros <= 20) {
				percentualDesconto = 4;
			} else {
				percentualDesconto = 6;
			}
			total = litros * precoGasolina;
		}

		totalDesconto = (total / 100) * percentualDesconto;
		double precoAPagar = total - totalDesconto;
		
		System.out.println("Valor a ser pago: " + precoAPagar);

		sc.close();
	}
}
