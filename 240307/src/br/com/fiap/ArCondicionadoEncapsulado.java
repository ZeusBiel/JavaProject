package br.com.fiap;

public class ArCondicionadoEncapsulado {

	//atributos
	private int temperatura;
	private String modo;
	
	//getters e setters
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		try {
			if (temperatura >= 15 && temperatura <= 26) {
				this.temperatura = temperatura;
			} else {
				throw new Exception("A temperatura está fora da faixa permitida! (15 ao 26)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String getModo() {
		return modo;
	}
	public void setModo(String modo) {
		try {
			if (modo.equals("Ventilar") || modo.equals("Aquecer") || modo.equals("Resfriar")) {
				this.modo = modo;
			} else {
				throw new Exception("O modo digitado não é um dos permitidos! (Resfriar, Ventilar ou Aquecer)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//métodos
	public void aumentarTemperatura() {
		if (temperatura >= 15) {
			temperatura++;
		}
	}
	public void diminuirTemperatura() {
		if (temperatura <= 26) {
			temperatura--;
		}
	}
	public void trocarModo(String mode) {
		modo = mode;
	}
	public void mostrar() {
		System.out.println("Temperatura: " + getTemperatura() + "\nModo: " + getModo());
	}
}
