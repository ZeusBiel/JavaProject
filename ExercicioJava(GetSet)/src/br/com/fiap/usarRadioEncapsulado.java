package br.com.fiap;

public class usarRadioEncapsulado {
	public static void main(String[] args) {
		RadioEncapsulado radio1 = new RadioEncapsulado();
		
		radio1.setEstacao(85.1f);
		radio1.setVolume(99);
		radio1.mostrar();
		
		radio1.setEstacao(95.2f);
		radio1.aumentarVolume();
		radio1.aumentarVolume();
		radio1.aumentarVolume();
		radio1.mostrar();
	}
}
