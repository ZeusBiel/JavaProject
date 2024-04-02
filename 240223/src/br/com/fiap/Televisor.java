package br.com.fiap;

public class Televisor {

	//atributos da Classe
	public int volume;
	public int canal;
	
	//métodos da Classe
	public void aumentarVolume() {
		volume++;
	}
	public void diminuirVolume() {
		volume--;
	}
	
	public void trocarCanal(int c) {
		canal = c;
	}
	public void mostrar() {
		System.out.println("Volume: " + volume);
		System.out.println("Canal: " + canal);
	}
}
