package com.junior.cursojava.aula13Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o tamanho do lado do quadrado: ");
		double ladoDaArea = sc.nextDouble();

		double area = Math.pow(ladoDaArea, 2);

		System.out.println("A �rea do quadrado �: " + area);
		System.out.println("O dobro da �rea do quadrado �: " + (area * 2));

		sc.close();
	}
}
