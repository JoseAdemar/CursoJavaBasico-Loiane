package com.junior.cursojava.aula27OOP;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro();

		carro.marca = "FIAT";
		carro.modelo = "Ducato";
		carro.numPassageiros = 10;
		carro.capCombustivel = 100;
		carro.consumoCombustivel = 0.2;
		
		Double autonomia = carro.exibirAutonomia2();
		Double consumo = carro.calcularCombustivel(10);
		
		System.out.println("A quantidade de consumo é " + consumo);
		
		System.out.println("A autonomia do carro é de " + autonomia);
	}
}
