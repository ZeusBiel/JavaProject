package br.com.fiap;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Televisor tv = new Televisor();
		tv.canal = 2;
		tv.volume = 5;
		tv.diminuirVolume();
		tv.mostrar();
		
		ArCondicionado ac = new ArCondicionado();
		ac.modo = "Resfriar";
		ac.temperatura = 21;
		ac.aumentarTemperatura();
		ac.trocarModo("Ventilar");
		ac.mostrar();
	}

}
