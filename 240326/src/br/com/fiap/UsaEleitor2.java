package br.com.fiap;

import java.util.Scanner;

public class UsaEleitor2 {

	public static void main(String[] args) {


		Eleitor eleitor1 = new Eleitor();
		Eleitor eleitor2 = new Eleitor();
		Scanner scan;
		
		try {
			//Eleitor 1
			scan = new Scanner(System.in);
			System.out.println("Digite o seu nome: ");
			eleitor1.setNome(scan.nextLine());
			System.out.println("Digite o seu ano de nascimento: ");
			eleitor1.setAnoNascimento(scan.nextInt());
			if (eleitor1.getAnoNascimento() > 1900 && eleitor1.getAnoNascimento() <= 2008) {
			System.out.println("Digite o número de seu título: ");
			eleitor1.setNumTitulo(scan.nextInt());
			System.out.println("Digite a sua zona: ");
			eleitor1.setZona(scan.nextInt());
			System.out.println("Digite a sua seção: ");
			eleitor1.setSecao(scan.nextInt());
			System.out.println("ELEITOR 1\n" +
								"Nome: " + eleitor1.getNome() 
								+ "\nIdade: " + eleitor1.calculaIdade(2024)
								+ "\nNúmero: " + eleitor1.getNumTitulo()
								+ "\nZona: " + eleitor1.getZona()
								+ "\nSeção: " + eleitor1.getSecao());
			} else {
				System.out.println();
			}
				//Eleitor 2
				scan = new Scanner(System.in);
				System.out.println("\n\nDigite o seu nome: ");
				eleitor2.setNome(scan.nextLine());
				System.out.println("Digite o seu ano de nascimento: ");
				eleitor2.setAnoNascimento(scan.nextInt());
				if (eleitor1.getAnoNascimento() > 1900 && eleitor1.getAnoNascimento() <= 2008) {
				System.out.println("Digite o número de seu título: ");
				eleitor2.setNumTitulo(scan.nextInt());
				System.out.println("Digite a sua zona: ");
				eleitor2.setZona(scan.nextInt());
				System.out.println("Digite a sua seção: ");
				eleitor2.setSecao(scan.nextInt());
				
				System.out.println("ELEITOR 2\n" +
									"Nome: " + eleitor2.getNome() 
									+ "\nIdade: " + eleitor2.calculaIdade(2024) + " anos"
									+ "\nNúmero do título: " + eleitor2.getNumTitulo()
									+ "\nZona: " + eleitor2.getZona()
									+ "\nSeção: " + eleitor2.getSecao());
				} else {
					System.out.println();
				}
		} catch (Exception e) {
			System.out.println("Nome/Ano de nascimento/Número do título/Zona e/ou seção inválido!");
		}


	
		
	}

}
