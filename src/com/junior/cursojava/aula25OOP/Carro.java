package com.junior.cursojava.aula25OOP;

public class Carro {

	public String marca;
	public String modelo;
	public int numPassageiros;
	public double capCombustivel;
	public double consumoCombustivel;
	
	
	public void exibirAutonomia() {
		
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " km" );
	}
}
