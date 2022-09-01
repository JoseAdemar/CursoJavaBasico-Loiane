package com.junior.cursojava.aula36;

public class Teste {
	public static void main(String[] args) {

		Contato contato = new Contato();
        contato.setNome("Tyrion");

		Telefone telefone1 = new Telefone();
		telefone1.setTipo("Celular");
		telefone1.setDdd("61");
		telefone1.setNumero("85474785");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("Celular");
		telefone2.setDdd("11");
		telefone2.setNumero("45474785");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone1;
		telefones[1] = telefone2;

		contato.setTelefone(telefones);

		Endereco endereco = new Endereco();
		endereco.setCidade("Brasilia");
		endereco.setNomeRua("QNE");
		endereco.setCep("7212555");
		endereco.setEstado("DF");
		endereco.setNumero("32");
		endereco.setComplemento("Apartamento");

		contato.setEndereco(endereco);

		System.out.println(contato.getNome());
		System.out.println(contato.getEndereco());
		
		for(Telefone t : telefones) {
		System.out.println("TELEFONE: " + t.getNumero());
		}
	}
}
