package com.junior.cursojava.aula40;



public class Professor extends Pessoa {

	private double salario;
	private String nomeCurso;
	
	@Override
	public String obterEtiquetaEndereco() {
		String s = "Endereço do professor: ";
		s += this.getEndereco();
		return s;
	}
	
	
	public double calcularSalarioLiquido() {
		return 0;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getNomeCurso() {
		return nomeCurso;
	}


	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}


	
	

}
