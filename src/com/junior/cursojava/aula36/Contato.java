package com.junior.cursojava.aula36;

import java.util.Arrays;

public class Contato {

	 private String nome;
	 private Endereco endereco;
	 private Telefone[]  telefone;
	 
	 
	 
	 
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", endereco=" + endereco + ", telefone=" + Arrays.toString(telefone) + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone[] getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone[] telefone) {
		this.telefone = telefone;
	}
	
	 
}