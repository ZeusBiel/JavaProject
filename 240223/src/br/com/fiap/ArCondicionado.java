package br.com.fiap;

public class ArCondicionado {

	//atributos da Classe
	public int temperatura;
	public String modo;
	
	//métodos da Classe
	public void aumentarTemperatura() {
		temperatura++;
	}
	public void diminuirTemperatura() {
		temperatura--;
	}
	public void mudarModo(String m) {
		modo = m;
	}
	
	public void mostrar() {
		System.out.println("Temperatura:" + temperatura);
		System.out.println("Modo: " + modo);
	}
}
