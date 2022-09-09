package com.junior.cursojava.aula40;

import java.util.Arrays;

public class Aluno extends Pessoa {

	private String curso;
	private double[] notas;

	@Override
	public String obterEtiquetaEndereco() {

		String s = "Nota do aluno: ";

		s += this.getEndereco();
		return s;
	}

	public double calcularMedia() {
		return 0;
	}

	public boolean aprovado() {
		return true;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "curso=" + curso + ", \n notas=" + Arrays.toString(notas) + ",\n getNome()=" + getNome()
				+ ",\n getEndereco()=" + getEndereco() + ",\n getTelefone()=" + getTelefone() + ",\n getCpf()="
				+ getCpf() + "]";
	}

}
