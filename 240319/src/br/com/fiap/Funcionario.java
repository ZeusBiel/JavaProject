package br.com.fiap;

public class Funcionario {

	//atributos
	private String nome;
	private float valorHora;
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
	//Método
	public float salario(int horasSemanais) {
		float salario = (horasSemanais * valorHora) * 4;
		return salario;
	}
}
