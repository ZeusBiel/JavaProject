package br.com.fiap;

public class Televisor {

	public int volume, canal;
	
	public void aumentarVolume() {
		volume++;
	}
	
	public void diminuirVolume() {
		volume--;
	}
	
	public void trocarCanal(int channel) {
		canal = channel;
	}
	
	public void mostrar() {
		System.out.println("Canal: " + canal + "\nVolume: " + volume);
	}
}
