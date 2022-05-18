package com.junior.cursojava.aula13Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {
public static void main(String[] args) {
	 Locale.setDefault(Locale.US);
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Entre com a temperaturaem Farenheit: ");
	 double farenheit = sc.nextDouble();
	 
	 double celcius = (5 * (farenheit-32) / 9);
	 
	 System.out.printf("%.0f Fº = %.2f" + " Cº ", farenheit, celcius);
	 
	 
	 
	 
	 sc.close();
}
}
