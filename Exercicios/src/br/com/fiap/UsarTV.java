package br.com.fiap;

public class UsarTV {

	public static void main(String[] args) {
		
		TV TV1 = new TV();
		
		TV1.volume = 5;
		TV1.canal = 10;
		TV1.mostrar();
		
		TV1.trocarCanal(12);
		TV1.aumentarVolume();
		TV1.aumentarVolume();
		TV1.mostrar();
	}
}
