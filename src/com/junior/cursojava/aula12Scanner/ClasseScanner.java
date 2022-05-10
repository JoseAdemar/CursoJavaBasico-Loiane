package com.junior.cursojava.aula12Scanner;

import java.util.Locale;
import java.util.Scanner;

public class ClasseScanner {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o seu nome completo: ");
		String nomeCompleto = sc.nextLine();

		System.out.println("Full name: " + nomeCompleto);

		sc.close();

	}
}
