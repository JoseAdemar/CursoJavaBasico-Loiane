package com.junior.cursojava.aula13Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entre com o tamanho do arquivo");
	double tamanhoArquivo = sc.nextDouble();
	
	System.out.println("Entre com a velocidade da internet");
	double velocidadeDaInternet = sc.nextDouble();
	
	double tempo = tamanhoArquivo / velocidadeDaInternet;
	
	System.out.println("Tempo para download = " + tempo);
	
	sc.close();
}
}
