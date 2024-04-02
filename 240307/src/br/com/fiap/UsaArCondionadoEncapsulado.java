package br.com.fiap;

import java.util.Scanner;

public class UsaArCondionadoEncapsulado {

	public static void main(String[] args) {
		
		ArCondicionadoEncapsulado ac = new ArCondicionadoEncapsulado();
		
		int escolha = 0;
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Escolha uma temperatura e defina o modo");
			ac.setTemperatura(scan.nextInt());
			ac.setModo(scan.next());
			System.out.println("Faça sua escolha: "
					+ "\n(1)Definir temperatura"
					+ "\n(2)Definir modo"
					+"\n(3)Aumentar temperatura"
					+"\n(4)Diminuir temperatura");
			escolha = scan.nextInt();
			if (escolha == 1) {
				System.out.println("Escolha uma nova temperatura: ");
				ac.setTemperatura(scan.nextInt());
			} else if (escolha == 2){
				System.out.println("Escolha novo modo:");
				ac.setModo(scan.next());
			} else if (escolha == 3){
				ac.aumentarTemperatura();
			} else if (escolha == 4){
				ac.diminuirTemperatura();
			}else {
				System.out.println("Sua escolha não está dentro das previstas!");
			}
			ac.mostrar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
