package com.junior.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a letra: ");
		String letra = sc.next();

		if (letra.equalsIgnoreCase("a") 
				|| letra.equalsIgnoreCase("e") 
				|| letra.equalsIgnoreCase("i")
				|| letra.equalsIgnoreCase("o") 
				|| letra.equalsIgnoreCase("u")) {

			System.out.println("A letra é vogal");

		} else if(letra.length() > 1){
			System.out.println("A letra é inválida");
		}else {
			System.out.println("A letra é concoante");
		}

		sc.close();
	}
}
