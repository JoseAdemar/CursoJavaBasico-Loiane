package com.junior.cursojava.aula17Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean usuarioESenhaCorreto = false;

		while (usuarioESenhaCorreto == false) {

			System.out.println("Entre com o nome do usu�rio: ");
			String nomeUsuario = sc.next();

			System.out.println("Entre com a senha");
			String senha = sc.next();

			if (nomeUsuario.equalsIgnoreCase(senha)) {
				usuarioESenhaCorreto = false;

				System.out.println("Usuario e senha s�o iguais, digite novamente");
			} else {

				System.out.println("Senha e usuario v�lido");
				usuarioESenhaCorreto = true;
			}
		}

		sc.close();
	}
}
