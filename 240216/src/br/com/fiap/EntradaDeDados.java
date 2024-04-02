package br.com.fiap;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0;
		Scanner scan; //declarando um objeto
		
		//declara = anuncia / instância = efetivou
		
		try {
			scan = new Scanner(System.in); //Instanciando o objeto
			System.out.println("Digite dois números inteiros:");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			System.out.println("Valor 1 : " + num1 + "\nValor 2 : " + num2);
			System.out.println("Soma dos valores: " + (num1 + num2));
			
		} catch (Exception e) {
			System.out.println("Formato incorreto do número");
		}

	}

}
