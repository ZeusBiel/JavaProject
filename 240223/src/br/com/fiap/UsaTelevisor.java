package br.com.fiap;

public class UsaTelevisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Televisor televisor1 = new Televisor();
		
		televisor1.canal = 386;
		televisor1.volume = 15;
		
		televisor1.aumentarVolume();
		televisor1.trocarCanal(621);
		televisor1.diminuirVolume();
		televisor1.mostrar();
	}

}
