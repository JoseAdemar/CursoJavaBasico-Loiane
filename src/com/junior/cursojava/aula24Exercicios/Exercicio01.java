package com.junior.cursojava.aula24Exercicios;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.modelo = "Led";
		lampada.cor = "Amarelo";
		lampada.potencia = 10;
		lampada.tipoDaLampada = new String[5];
		lampada.tipoDaLampada[0] = "Abajur";
		lampada.tipoDaLampada[1] = "Pendente";
		
		System.out.println(lampada);
		
	}

}
