package br.com.fiap;

public class Eleitor {

	//Atributos
	private String nome;
	private int anoNascimento, numTitulo, zona, secao;
	
	//construtores
	public Eleitor() {
	}
	public Eleitor(String nome, int anoNascimento, int numTitulo, int zona, int secao) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.numTitulo = numTitulo;
		this.zona = zona;
		this.secao = secao;
	}
	
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
		try {
			if (anoNascimento >= 1900 && anoNascimento <= 2008) {
				this.anoNascimento = anoNascimento;
			} else {
				throw new Exception("O ano de nascimento deve ser maior ou igual a 1900 e menor do que 2008");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		this.anoNascimento = anoNascimento;
	}
	public int getNumTitulo() {
		return numTitulo;
	}
	public void setNumTitulo(int numTitulo) {
		this.numTitulo = numTitulo;
	}
	public int getZona() {
		return zona;
	}
	public void setZona(int zona) {
		this.zona = zona;
	}
	public int getSecao() {
		return secao;
	}
	public void setSecao(int secao) {
		this.secao = secao;
	}
	
	//Métodos
	public int calculaIdade(int anoAtual) {
		int idade = anoAtual - anoNascimento;
		return idade;
	}

}
