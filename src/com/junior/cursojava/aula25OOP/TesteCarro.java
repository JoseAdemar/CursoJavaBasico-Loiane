package com.junior.cursojava.aula25OOP;


public class TesteCarro {
public static void main(String[] args) {
	
	Carro van = new Carro();

	van.marca = "FIAT";
	van.modelo = "Ducato";
	van.numPassageiros = 10;
	van.capCombustivel = 100;
	van.consumoCombustivel = 0.2;
	
	van.exibirAutonomia();
	
}
}
