package com.junior.cursojava.aula31;

public class Carro {


	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca  = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel  = consumoCombustivel;

	}

	public Double exibirAutonomia2() {

		return this.capCombustivel * this.consumoCombustivel;

	}

	public double calcularCombustivel(double km) {

		double qtdCombustivel = (km / consumoCombustivel);

		return qtdCombustivel;
	}

}
