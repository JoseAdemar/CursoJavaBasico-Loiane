package com.junior.cursojava.aula39;

import java.util.Arrays;

import com.junior.cursojava.aula37.Pessoa;

public class Aluno extends Pessoa {

	private String curso;
	private double[] notas;

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
				+ ",\n getEndereco()=" + getEndereco() + ",\n getTelefone()=" + getTelefone() + ",\n getCpf()=" + getCpf()
				+ "]";
	}

	

	

	

}
