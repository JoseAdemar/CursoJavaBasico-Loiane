package com.junior.cursojava.aula32;

public class TesteCarro {
	public static void main(String[] args) {

		Carro ferrari = new Carro();

		ferrari.SetMarca("Ferrari");
		ferrari.setModelo("Ferrari V8");
		ferrari.setNumPassageiros(2);
		ferrari.setCapCombustivel(100);
		ferrari.setConsumoCombustivel(20);
		
		System.out.println(ferrari);

	}
}
