package com.junior.cursojava.aula13Exercicios;

import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entre com um número: ");
	int numero = sc.nextInt();
	
	System.out.println("O número informado foi: "+ numero);
	
	sc.close();
}
}
