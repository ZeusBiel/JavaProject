package br.com.fiap;

public class TV {
	public int volume;
	public int canal;
	
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
		System.out.println("Volume atual: " + volume + "\nCanal atual: " + canal);
	}
}
