package com.junior.cursojava.aula24Exercicios;

public class Livro {

	String nome;
	String autor;
	int quantidadeDePaginas;
	int anoDeLancamento;
	String isbn;

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", autor=" + autor + ", quantidadeDePaginas=" + quantidadeDePaginas
				+ ", anoDeLancamento=" + anoDeLancamento + ", isbn=" + isbn + "]";
	}

}
