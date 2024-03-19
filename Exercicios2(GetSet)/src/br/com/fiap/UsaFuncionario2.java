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
			System.out.println("Digite as horas de trabalho por semana: ");
			System.out.println("Nome: "+funcionario1.getNome()+"\nValor hora: "+funcionario1.getValorHora()+"\nSalario total: "+funcionario1.salario(scan.nextInt()));
		} catch (Exception e) {
			System.out.println("Nome e/ou valor hora inválidos");
		}

	}

}