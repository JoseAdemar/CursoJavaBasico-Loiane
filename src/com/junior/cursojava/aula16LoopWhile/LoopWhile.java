package com.junior.cursojava.aula16LoopWhile;

public class LoopWhile {
	public static void main(String[] args) {

		int i = 1;
		int max = 10;

		while (i <= max) {
			i++;

			System.out.println("Valor de i: " + (i - 1));
		}

		do {
			System.out.println("Valor de i: " + (i));
			i++;
		} while (i <= 20);

		System.out.println(i - 1);

	}
}
