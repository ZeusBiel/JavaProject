package br.com.fiap;

public class UsaRadio extends Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Radio radio1 = new Radio();
		
		radio1.volume = 5;
		radio1.estacao = 89.1f;
		radio1.mostrar();
		
		radio1.trocarEstacao(92.5f);
		radio1.aumentarVolume();
		radio1.aumentarVolume();
		radio1.mostrar();
	}

}
