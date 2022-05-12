package com.junior.cursojava.aula13Exercicios;

import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
	
	System.out.println("Entre com a primeira nota: ");
	double primeiraNota = sc.nextDouble();
	
	System.out.println("Entre com a primeira nota: ");
	double segundaNota = sc.nextDouble();
	
	System.out.println("Entre com a primeira nota: ");
	double terceiraNota = sc.nextDouble();
	
	System.out.println("Entre com a primeira nota: ");
	double quartaNota = sc.nextDouble();
	
	double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
	
	System.out.println("A média é: " + media);
	
	
	sc.close();
}
}
