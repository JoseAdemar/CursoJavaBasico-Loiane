package com.junior.cursojava.aula19Arrays;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		double temperaturaDoDia1 = 31.3;
//		double temperaturaDoDia2 = 32;
//		double temperaturaDoDia3 = 33.7;
//		double temperaturaDoDia4 = 34;
//		double temperaturaDoDia5 = 33.1;

		double[] teperaturaDoDia = new double[365];
		// double[] teperaturaDoDia =
		// {temperaturaDoDia1,temperaturaDoDia2,temperaturaDoDia3,temperaturaDoDia4,temperaturaDoDia5};
		teperaturaDoDia[0] = 31.3;
		teperaturaDoDia[1] = 32;
		teperaturaDoDia[2] = 33.7;
		teperaturaDoDia[3] = 34;
		teperaturaDoDia[4] = 33.1;

		System.out.println("O valor da temperatura do dia 3 é: " + teperaturaDoDia[2]);
		System.out.println("O tamanho do array é: " + teperaturaDoDia.length);

		System.out.println("Valores do array");

		for (int i = 0; i < teperaturaDoDia.length; i++) {

			System.out.println("O valor da temperatura do dia " + (i + 1) + " é " + teperaturaDoDia[i]);
		}

		// Forma dois de listar o array
		System.out.println("|-----------------------------------------|");

		for (double temp : teperaturaDoDia) {
			System.out.println("O valor da temperatura do dia  é " + temp);
		}

		scanner.close();
	}
}
