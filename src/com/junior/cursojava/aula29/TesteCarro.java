package com.junior.cursojava.aula29;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro("Fiat", "Ducato", 10, 10, 10);
		
		Double autonomia = carro.exibirAutonomia2();
		Double consumo = carro.calcularCombustivel(10);
		
		System.out.println("A quantidade de consumo é " + consumo);
		
		System.out.println("A autonomia do carro é de " + autonomia);

	}

}
