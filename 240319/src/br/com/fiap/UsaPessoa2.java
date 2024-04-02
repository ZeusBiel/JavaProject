package br.com.fiap;

import java.util.Scanner;

public class UsaPessoa2 {

	public static void main(String[] args) {

		Pessoa pessoa2 = new Pessoa();
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite seu nome: ");
			pessoa2.setNome(scan.nextLine());
			System.out.println("Digite seu ano de nascimento: ");
			pessoa2.setAnoNascimento(scan.nextInt());
			System.out.println("Nome: " + pessoa2.getNome() + "\nIdade: " + pessoa2.calcularIdade(2024));
		} catch (Exception e) {
			System.out.println("nome e/ou ano de nascimento inválido!");
		}
	}

}
