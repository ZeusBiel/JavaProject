package br.com.fiap;

import java.util.Scanner;

public class Idade1 {

	public static void main(String[] args) {
		
		int anoNasc = 0, anoAtual = 0;
		Scanner scan; //declarando um objeto
		
		//declara = anuncia / instância = efetivou
		
		try {
			scan = new Scanner(System.in); //Instanciando o objeto
			System.out.println("Digite o ano atual: ");
			anoAtual = scan.nextInt();
			System.out.println("Digite o ano de seu nascimento: ");
			anoNasc = scan.nextInt();
			System.out.println("Sua idade é: " + (anoAtual - anoNasc));
			
		} catch (Exception e) {
			System.out.println("Formato incorreto do número");
		}

	}

}
