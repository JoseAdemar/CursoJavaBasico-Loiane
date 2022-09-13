package com.junior.cursojava.aula40;

public final class Pessoa {

	private String nome;
	private static final String ENDERECO = "Teste";
	private String telefone;
	private String cpf;
	
	
	public static final String obterEtiquetaEndereco() {
		return ENDERECO;
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return ENDERECO;
	}

	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
