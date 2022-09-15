package com.junior.cursojava.aula47;

public class Execao {
public static void main(String[] args) {
	
	try {
	int[] vetor = new int[4];
	
	System.out.println("Antes da exceção");
	
	vetor[4] = 1;
	
	System.out.println("Esse texto não será impresso");
	
	}catch(ArrayIndexOutOfBoundsException ex) {
		System.out.println("Index 4 fora do limite permitido para o vetor");
	}
	
	System.out.println("Depois da exceção o código continua executando porque a exceção foi tratada");
}
}
