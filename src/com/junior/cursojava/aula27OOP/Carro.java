package com.junior.cursojava.aula27OOP;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	public Double exibirAutonomia2() {

		return this.capCombustivel * this.consumoCombustivel;

	}
	
	public double calcularCombustivel(double km) {
		
		double qtdCombustivel = (km/consumoCombustivel);
		
		return qtdCombustivel;
	}

}
