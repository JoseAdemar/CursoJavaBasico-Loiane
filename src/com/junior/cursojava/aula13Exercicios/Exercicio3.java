package com.junior.cursojava.aula13Exercicios;

import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe o primeiro número: ");
	int primeiroNumero = sc.nextInt();
	
	System.out.println("Informe o segundo número");
	int segundoNumero = sc.nextInt();
	
	int resultado = primeiroNumero + segundoNumero;
	System.out.println( "A soma é: " + resultado);
	
	sc.close();
}
}
