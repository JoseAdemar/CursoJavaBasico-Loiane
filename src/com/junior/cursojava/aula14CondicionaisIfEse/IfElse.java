package com.junior.cursojava.aula14CondicionaisIfEse;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a idade");
		int idade = sc.nextInt();

		if (idade >= 18) {
			System.out.println("Você é maior de idade sua idade é: " + idade);
		} else {
			System.out.println("Você é menor de idade sua idade é: " + idade);
		}

		System.out.println("Entre com o preço: ");
		double preco = sc.nextDouble();

		if (preco <= 10) {
			System.out.println("Está bem barato o preço está: " + preco + " Reais");
		} else if (preco > 10 && preco < 15) {
			System.out.println("Você pode pedir um desconto o preço está: " + preco + " Reais");
		} else if (preco >= 15 && preco < 17) {
			System.out.println("Você pode pesquisar mais o preço está: " + preco + " Reais");
		} else {
			System.out.println("Está absurdo de caro o preço está: " + preco + " Reais");
		}

		sc.close();

	}
}
