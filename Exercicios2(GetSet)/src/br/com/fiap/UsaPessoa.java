package br.com.fiap;

public class UsaPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Gabriel");
		pessoa1.setAnoNascimento(2004);
		int idade = pessoa1.calculaIdade(2024);
		System.out.println("Nome: "+pessoa1.getNome()+"\nIdade: "+idade);
		
	}

}
