package com.junior.cursojava.aula43;

public class Aluno {

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

	public String toString() {
		String course = curso + "\n";
		for (double nota : notas) {
			System.out.println(nota);
		}

		return course;
	}

}
