package br.com.fiap;

public class UsaFuncionario {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		func.setNome("Astrogildo Planetário");
		func.setValorHora(60);
		float salario = func.salario(40);
		System.out.println("Nome: " + func.getNome() + "\nSalário mensal: R$ " + salario);

	}

}
