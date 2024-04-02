package br.com.fiap;

import java.util.Scanner;

public class Trapezio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float baseMaior = 0f;
		float altura = 0f;
		float baseMenor = 0f;
		Scanner scan; //declarando um objeto
		
		//declara = anuncia / instância = efetivou
		
		try {
			scan = new Scanner(System.in); //Instanciando o objeto
			System.out.println("Digite a maior base do trapézio: ");
			baseMaior = scan.nextFloat();
			System.out.println("Digite a menor base do trapézio: ");
			baseMenor = scan.nextFloat();
			System.out.println("Digite a altura do trapézio: ");
			altura = scan.nextFloat();
			System.out.println("A área deste trapézio é: " + ((baseMaior + baseMenor)* altura)/2);
			
		} catch (Exception e) {
			System.out.println("Formato incorreto do número");
		}
	}

}
