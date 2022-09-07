package com.junior.cursojava.aula37;

public class Teste {
	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
	    double notas[] = new double [3];
		
		aluno.setNome("João");
		aluno.setCpf("58747489");
		aluno.setEndereco("qne 9");
		aluno.setTelefone("85747478");
		aluno.setCurso("JAVA");
		notas[0] = 10;
		notas[1] = 9;
		notas[2] = 8;
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		
		
		
		
	}
}
