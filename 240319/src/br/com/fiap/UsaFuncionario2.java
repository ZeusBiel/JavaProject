package br.com.fiap;

import java.util.Scanner;

public class UsaFuncionario2 {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o seu nome: ");
			func.setNome(scan.nextLine());
			System.out.println("Digite o valor de cada hora: ");
			func.setValorHora(scan.nextFloat());
			System.out.println("Digite a quantidade de horas trabalhadas semanalmente: ");
			System.out.println("\nNome: " + func.getNome() + 
					"\nValor do seu salário mensal é: " + func.salario(scan.nextInt()));
		} catch (Exception e) {
			System.out.println("Nome, valor por hora e/ou horas trabalhadas inválidos");
		}

	}

}
