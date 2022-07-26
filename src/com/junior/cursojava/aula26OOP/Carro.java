package com.junior.cursojava.aula26OOP;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	
	public Double exibirAutonomia2() {

		return this.capCombustivel * this.consumoCombustivel;

	}
}
