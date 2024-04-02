package br.com.fiap;

public class UsaRadioEncapsulada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RadioEncapsulada radio1 = new RadioEncapsulada();
		
		radio1.setEstacao(90.0f);
		radio1.setVolume(100);
		
		radio1.aumentarVolume();
		radio1.aumentarVolume();
		radio1.mostrar();
	}

}
