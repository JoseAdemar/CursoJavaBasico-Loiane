package com.junior.cursojava.aula24OOP;

public class TesteCarro {
	public static void main(String[] args) {

		Carro van = new Carro();

		van.marca = "FIAT";
		van.modelo = "Ducato";
		van.capacidadeDePassageiros = 5;
		van.capacidadeCombustivel = 100;
		van.consumoConsbustivel = 0.2;
		
		
		System.out.println(van);

	}
}
