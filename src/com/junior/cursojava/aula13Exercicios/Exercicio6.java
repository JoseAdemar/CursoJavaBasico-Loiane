package com.junior.cursojava.aula13Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe o raio do círculo");
	double raio = sc.nextDouble();
	
	double area = Math.PI * Math.pow(raio, 2);
	
	System.out.printf("A área do círculo é: %.2f " , area);
	
	sc.close();
}
}
