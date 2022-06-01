package com.junior.cursojava.aula13Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe a altura da pessoa: ");
	double altura = sc.nextDouble();
	
	double pesoIdeal = (72.7 * altura ) - 58;
	
	System.out.println("O peso ideal é: " + pesoIdeal);
	
	sc.close();
}
}
