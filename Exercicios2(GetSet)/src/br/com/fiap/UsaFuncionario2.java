package br.com.fiap;

import java.util.Scanner;

public class UsaFuncionario2 {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o nome: ");
			funcionario1.setNome(scan.nextLine());
			System.out.println("Digite o valor ganho por hora: ");
			funcionario1.setValorHora(scan.nextFloat());
			System.out.println("Salario total: "+funcionario1.salario(8));
		} catch (Exception e) {
			System.out.println("Nome e/ou valor hora inválidos");
		}

	}

}
