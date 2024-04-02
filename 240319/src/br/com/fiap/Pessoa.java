package br.com.fiap;

public class Pessoa {

	//Atributos
	private String nome;
	private int anoNascimento;
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	//Métodos
	public int calcularIdade(int anoAtual) {
		int idade = anoAtual - anoNascimento;
		return idade;
	}
	
}
