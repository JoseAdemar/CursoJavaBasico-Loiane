package com.junior.cursojava.aula14CondicionaisIfEse;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a idade");
		int idade = sc.nextInt();

		if (idade >= 18) {
			System.out.println("Voc� � maior de idade sua idade �: " + idade);
		} else {
			System.out.println("Voc� � menor de idade sua idade �: " + idade);
		}

		System.out.println("Entre com o pre�o: ");
		double preco = sc.nextDouble();

		if (preco <= 10) {
			System.out.println("Est� bem barato o pre�o est�: " + preco + " Reais");
		} else if (preco > 10 && preco < 15) {
			System.out.println("Voc� pode pedir um desconto o pre�o est�: " + preco + " Reais");
		} else if (preco >= 15 && preco < 17) {
			System.out.println("Voc� pode pesquisar mais o pre�o est�: " + preco + " Reais");
		} else {
			System.out.println("Est� absurdo de caro o pre�o est�: " + preco + " Reais");
		}

		sc.close();

	}
}
