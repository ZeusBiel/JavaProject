package br.com.fiap;

import java.util.Scanner;

public class EquacaoSegundoGrau1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0, b = 0, c = 0;
		double delta = 0, resultado1 = 0, resultado2 = 0;
		Scanner scan; //declarando um objeto
		
		//declara = anuncia / instância = efetivou
		
		try {
			scan = new Scanner(System.in); //Instanciando o objeto
			System.out.println("Digite o valor de A: ");
			a = scan.nextInt();
			System.out.println("Digite o valor de B: ");
			b = scan.nextInt();
			System.out.println("Digite o valor de C: ");
			c = scan.nextInt();
			
			delta = (b * b)-4 * a * c;
			resultado1 = ((-b + Math.sqrt(delta))/ (2*a)); 
			resultado2 = ((-b - Math.sqrt(delta))/ (2*a)); 
			System.out.println("Resultado 1: " + resultado1 + "\nResultado 2: " + resultado2);
			
		} catch (Exception e) {
			System.out.println("Formato incorreto do número");
		}
	}

}
