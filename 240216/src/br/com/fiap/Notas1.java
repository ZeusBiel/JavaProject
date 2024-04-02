package br.com.fiap;

import java.util.Scanner;

public class Notas1 {

	public static void main(String[] args) {
		
		float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;
		Scanner scan; //declarando um objeto
		
		//declara = anuncia / instância = efetivou
		
		try {
			scan = new Scanner(System.in); //Instanciando o objeto
			System.out.println("Digite as suas 4 notas:");
			nota1 = scan.nextFloat();
			nota2 = scan.nextFloat();
			nota3 = scan.nextFloat();
			nota4 = scan.nextFloat();
			System.out.println("Sua média é: " + (nota1 + nota2 + nota3 + nota4)/4);
			
		} catch (Exception e) {
			System.out.println("Formato incorreto do número");
		}

	}

}
