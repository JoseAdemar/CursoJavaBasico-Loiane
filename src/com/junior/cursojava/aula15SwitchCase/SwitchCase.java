package com.junior.cursojava.aula15SwitchCase;

import java.util.Scanner;

public class SwitchCase {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe um n�mero entre 1 e 7 ");
	int diaDaSemana = sc.nextInt();
	
	switch (diaDaSemana) {
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Ter�a-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta-feira");
			break;
		case 6:
			System.out.println("S�bado");
			break;
		case 7:
			System.out.println("Domingo");
			break;

		default:
			System.out.println("N�mero inv�lido");
			break;
	}
	
	sc.close();
}
}
