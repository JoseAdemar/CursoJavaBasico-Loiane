package com.junior.cursojava.aula15Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o valor/hora: ");
		double valorHora = sc.nextDouble();

		System.out.println("Horas trabalhadas no m�s: ");
		double horas = sc.nextDouble();

		double salarioBruto = valorHora * horas;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double iR = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + iR;
		double salarioLiquido = salarioBruto - totalDescontos;

		System.out.println("Seu sal�rio �: " + salarioBruto);
		System.out.println("Seu sal�rio �: " + inss);
		System.out.println("Seu sal�rio �: " + sindicato);
		System.out.println("Seu sal�rio �: " + iR);
		System.out.println("Seu sal�rio �: " + totalDescontos);
		System.out.println("Seu sal�rio �: " + salarioLiquido);

		sc.close();
	}
}
