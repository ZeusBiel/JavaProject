package br.com.fiap;

import java.util.Scanner;

public class UsaContaPoupanca {

	public static void main(String[] args) {
		
		ContaPoupanca conta = new ContaPoupanca();
		conta.setDonoConta("Gabriel");
		conta.setNumConta(69);
		conta.setSaldoConta(420);
		
		Scanner scan;
		try {
			System.out.println("Dono da conta: "+conta.getDonoConta()+"\nNúmero da conta: "+conta.getNumConta()+"\nSaldo: "+conta.getSaldoConta());
			scan = new Scanner(System.in);
			System.out.println("Depósito: ");
			conta.realizaDeposito(scan.nextFloat());
			System.out.println("Saldo: "+conta.getSaldoConta());
			System.out.println("Saque: ");
			conta.realizaSaque(scan.nextFloat());
			System.out.println("Saldo: "+conta.getSaldoConta());
		} catch (Exception e) {
			System.out.println("Ocorreu um erro");
		}
	}

}
