package com.junior.cursojava.aula34;

public class TesteCalculadora {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		calc.soma(10, 10);
		
		Calculadora.soma(20, 20);

		System.out.println(calc.toString(calc.soma(10, 10)));
		System.out.println(Calculadora.toString(Calculadora.soma(20, 20)));
	}
}
