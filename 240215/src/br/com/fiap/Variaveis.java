package br.com.fiap;

public class Variaveis {

	public static void main(String[] args) {
		//Declarar e Atribuir
		//Tipo nome = valor
		char sexo = 'f';
		byte idade = 25;
		short codigo = 15650;
		//Declara e Atribuir diversas variaveis do mesmo tipo
		int alunos = 50, turma = 11;
		long brasileiros = 149029728;
		float media = 8.7f; //Somente para o float usar o f
		double cotacaoDolar = 4.85;
		boolean alternativa = false;
		
		System.out.println("Sexo: " + sexo + "\nIdade: " + idade + "Código: " + codigo);
		System.out.println("Média: " + media + "Alunos: " + alunos + "Turma: " + turma);
		System.out.println("Habitantes: " + brasileiros + "Cotação do Dólar: " + cotacaoDolar);
		System.out.println("Alternativas: " + alternativa);
	}
}
