package com.junior.cursojava.aula26OOP;

public class TesteCarro {
	public static void main(String[] args) {
		
		Carro carro = new Carro();

		carro.marca = "FIAT";
		carro.modelo = "Ducato";
		carro.numPassageiros = 10;
		carro.capCombustivel = 100;
		carro.consumoCombustivel = 0.2;
		
		Double autonomia = carro.exibirAutonomia2();
		
		System.out.println("A autonomia do carro é de " + autonomia);
	
	    
	}
}
