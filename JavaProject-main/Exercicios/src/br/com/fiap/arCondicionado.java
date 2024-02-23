package br.com.fiap;

public class arCondicionado {

	int temperatura;
	String modo;
	
	public void aumentarTemperatura() {
		temperatura++;
	}
	public void diminuirTemperatura() {
		temperatura--;
	}
	public void trocarModo(String m) {
		modo = m;
	}
	public void mostrar() {
		System.out.println("Temperatura: " + temperatura+"\nModo: "+modo);
	}
	
}
