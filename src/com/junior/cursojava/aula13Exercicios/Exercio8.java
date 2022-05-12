package com.junior.cursojava.aula13Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercio8 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	System.out.println("Entre com o valor/hora: ");
	double valorHora = sc.nextDouble();
	
	System.out.println("Horas trabalhadas no mês: ");
	double horas = sc.nextDouble();

	double salario = valorHora * horas;

	System.out.println("Seu salário é: " + salario);
	

	sc.close();
}
}
