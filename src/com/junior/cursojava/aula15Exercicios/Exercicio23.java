package com.junior.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o tipo da carne:  ");
		System.out.println("1 - file duplo");
		System.out.println("2 - alcatra");
		System.out.println("3 - picanha");

		int tipo = sc.nextInt();

		System.out.println("Quantos killos ? ");
		double quantidade = sc.nextDouble();

		double precoKillo = 0;

		if (tipo == 1) {
			System.out.println(quantidade + "kg - file duplo");
			if (quantidade < 5) {
				precoKillo = 4.9;
			} else {
				precoKillo = 5.8;
			}
		} else if (tipo == 2) {
			System.out.println(quantidade + "kg - alcatra");
			if (quantidade < 5) {
				precoKillo = 5.9;
			} else {
				precoKillo = 6.8;
			}
		} else if (tipo == 3) {
			System.out.println(quantidade + "kg - picanha");
			if (quantidade < 5) {
				precoKillo = 6.9;
			} else {
				precoKillo = 7.8;
			}
		}

		double total = quantidade * precoKillo;
		System.out.println(quantidade + " kg " + precoKillo + " = " + total);

		System.out.println("Compra no cartão ? digite 1 para sim");
		int cartao = sc.nextInt();
		if (cartao == 1) {
			double desconto = (total / 100) * 5;
			System.out.println("Desconto de: " + desconto);
			System.out.println("O valor a pagar: " + (total - desconto));
		} else {
			System.out.println("Valor a pagar: " + total);
		}

		sc.close();
	}
}
