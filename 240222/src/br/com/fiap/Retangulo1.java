package br.com.fiap;

import java.util.Scanner;

public class Retangulo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float lado = 0f;
		float altura = 0f;
		Scanner scan; //declarando um objeto
		
		//declara = anuncia / instância = efetivou
		
		try {
			scan = new Scanner(System.in); //Instanciando o objeto
			System.out.println("Digite o lado do retângulo: ");
			lado = scan.nextFloat();
			System.out.println("Digite a altura do retângulo: ");
			altura = scan.nextFloat();
			System.out.println("A área deste retângulo é: " + (lado * altura));
			
		} catch (Exception e) {
			System.out.println("Formato incorreto do número");
		}
	}

}
