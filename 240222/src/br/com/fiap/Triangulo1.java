package br.com.fiap;

import java.util.Scanner;

public class Triangulo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float base = 0f;
		float altura = 0f;
		Scanner scan; //declarando um objeto
		
		//declara = anuncia / instância = efetivou
		
		try {
			scan = new Scanner(System.in); //Instanciando o objeto
			System.out.println("Digite a base do triângulo: ");
			base = scan.nextFloat();
			System.out.println("Digite a altura do triângulo: ");
			altura = scan.nextFloat();
			System.out.println("A área deste triângulo é: " + (base * altura)/2);
			
		} catch (Exception e) {
			System.out.println("Formato incorreto do número");
		}
	}

}
