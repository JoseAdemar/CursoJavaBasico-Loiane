package com.junior.cursojava.aula27OOPExercicio;

import java.util.Arrays;

public class Lampada {

	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoDeLuz;
	int garatiaEmMesses;
	String[]tipoDaLampada ;
	boolean ligada = false;
	
	
	public void ligar() {
		
		ligada = true;
	}
	
	public void desligar() {
		
		ligada = false;
	}
	
	public void mostrandoEstatus() {
		if(ligada) {
			System.out.println("A lampada está ligada");
		}else {
			System.out.println("A lampada está desligada");
		}
	}
	
	
	@Override
	public String toString() {
		return " Lampada [modelo=" + modelo + ",\n tensao=" + tensao + ",\n potencia=" + potencia + ",\n cor=" + cor
				+ ",\n tipoDeLuz=" + tipoDeLuz + ",\n garatiaEmMesses=" + garatiaEmMesses + ",\n tipoDaLampada="
				+ Arrays.toString(tipoDaLampada) + "]";
	}
}
