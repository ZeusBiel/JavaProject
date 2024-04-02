package br.com.fiap;

public class ContaPoupanca {

	private int numConta;
	private String donoConta;
	private float saldoConta;
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		try {
			this.numConta = numConta;
		} catch (Exception e) {
			System.out.println("Valor da conta inválido");
		}
	}
	public String getDonoConta() {
		return donoConta;
	}
	public void setDonoConta(String donoConta) {
		try {
			this.donoConta = donoConta;
		} catch (Exception e) {
			System.out.println("Valor do dono inválido");
		}
	}
	public float getSaldoConta() {
		return saldoConta;
	}
	public void setSaldoConta(float saldoConta) {
		try {
			if (saldoConta >= 0) {
				this.saldoConta = saldoConta;
			} else {
				System.out.println("Valor abaixo de 0");
			}
		} catch (Exception e) {
			System.out.println("Valor do saldo inválido");
		}
	}
	
	public void realizaSaque(float valor) {
		try {
			if (saldoConta >= valor && valor > 0) {
				saldoConta = saldoConta - valor;
			} else {
				System.out.println("Valor do saque excede o saldo da conta ou é menor que 0");
			}
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao realizar o saque");
		}
		
	}
	
	public void realizaDeposito(float valor) {
		try {
			if (valor > 0) {
				saldoConta = saldoConta + valor;
			} else {
				System.out.println("Valor deve ser maior que 0");
			}
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao realizar o deposito");
		}
		
	}
	
}
