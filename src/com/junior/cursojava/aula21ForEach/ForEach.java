package com.junior.cursojava.aula21ForEach;

import java.util.Random;

public class ForEach {
	public static void main(String[] args) {

		int[] notas = new int[10];

		Random random = new Random();

		for (int i = 0; i < notas.length; i++) {

			notas[i] = random.nextInt();
		}

		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}

		System.out.println();
		System.out.println("Utilizando ForEach");
		System.out.println();

		for (int nota : notas) {
			System.out.println(nota);
		}
	}
}
