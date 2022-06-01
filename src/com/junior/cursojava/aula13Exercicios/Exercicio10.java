package com.junior.cursojava.aula13Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a temperatura em Celcius: ");
		double celcius = sc.nextDouble();

		double firenhight = (celcius * 1.8) + 32;

		System.out.println("A temperatura " + celcius + " C é igual a " + firenhight + " Farenhight");

		sc.close();
	}
}
