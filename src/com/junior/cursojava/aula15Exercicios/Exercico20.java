package com.junior.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercico20 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Telefonou para a vitima ? ");
		String resp1 = sc.next();

		System.out.println("Esteve no local do crime ? ");
		String resp2 = sc.next();

		System.out.println("Mora perto da vitima ? ");
		String resp3 = sc.next();

		System.out.println("J� trabalhou com a  vitima ? ");
		String resp4 = sc.next();

		System.out.println("Devia para a vitima ? ");
		String resp5 = sc.next();

		int cont = 0;

		if (resp1.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp2.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp3.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp4.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp5.equalsIgnoreCase("S")) {
			cont++;
		}

		if (cont == 2) {
			System.out.println("Suspeita");
		} else if (cont == 3 || cont == 4) {
			System.out.println("C�mplice");
		} else if (cont == 5) {
			System.out.println("Assasino");
		} else if (cont == 0) {
			System.out.println("Inocente");
		}

		sc.close();
	}
}
