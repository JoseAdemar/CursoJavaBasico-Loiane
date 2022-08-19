package com.junior.cursojava.aula35;

public class TesteCalculadora {
public static void main(String[] args) {
	
	 int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
	 System.out.println(fatorialNR);
	 
	 int fatorR = Calculadora.fatorial(5);
	 System.out.println(fatorR);
}
}
