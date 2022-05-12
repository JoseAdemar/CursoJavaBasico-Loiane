package com.junior.cursojava.aula13Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Entre com a quantidade em metros: ");
		double metros = sc.nextDouble();
		
		double centimetros = metros * 100;
		
		System.out.println(metros + " metros é igual a " + centimetros + " centimetros");
		
		sc.close();
	}
}
