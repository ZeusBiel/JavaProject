package br.com.fiap;

import java.util.Scanner;

public class Area1 {

	public static void main(String[] args) {
		
		float raio = 0;
		Scanner scan; //declarando um objeto
		
		//declara = anuncia / instância = efetivou
		
		try {
			scan = new Scanner(System.in); //Instanciando o objeto
			System.out.println("Digite o raio do círculo: ");
			raio = scan.nextFloat();
			System.out.println("A área deste círculo é: " + (raio * raio) * 3.14);
			
		} catch (Exception e) {
			System.out.println("Formato incorreto do número");
		}

	}

}
