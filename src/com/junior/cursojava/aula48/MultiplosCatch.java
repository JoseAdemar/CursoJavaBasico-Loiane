package com.junior.cursojava.aula48;

public class MultiplosCatch {
	public static void main(String[] args) {

		int[] numeros = {4,8,16,32,64,128};
		
		int[] demon = {2,0,4,8,0};
		
		for(int i=0; i< numeros.length; i++ ) {
			
			try {
			System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i] / demon[i]));
			}
			catch(ArithmeticException | ArrayIndexOutOfBoundsException ex) {
				System.out.println("O número não pode ser dividido por zero");
			}
//			catch(ArrayIndexOutOfBoundsException ex) {
//				System.out.println("Index fora do limite permitido do array");
//			}
		}
	}
}
