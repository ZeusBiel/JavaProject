package br.com.fiap;

public class UsaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Joreba");
		funcionario1.setValorHora(50);
		
		System.out.println("Salario mensal: "+funcionario1.salario(8));
	}

}
