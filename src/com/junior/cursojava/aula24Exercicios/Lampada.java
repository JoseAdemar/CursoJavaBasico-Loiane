package com.junior.cursojava.aula24Exercicios;

import java.util.Arrays;

public class Lampada {

	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoDeLuz;
	int garatiaEmMesses;
	String[]tipoDaLampada ;
	@Override
	public String toString() {
		return " Lampada [modelo=" + modelo + ",\n tensao=" + tensao + ",\n potencia=" + potencia + ",\n cor=" + cor
				+ ",\n tipoDeLuz=" + tipoDeLuz + ",\n garatiaEmMesses=" + garatiaEmMesses + ",\n tipoDaLampada="
				+ Arrays.toString(tipoDaLampada) + "]";
	}
	
	
}
