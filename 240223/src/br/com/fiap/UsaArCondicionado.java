package br.com.fiap;

public class UsaArCondicionado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArCondicionado ac1 = new ArCondicionado();
		
		ac1.modo = "refrigerar";
		ac1.temperatura = 26;
		
		ac1.aumentarTemperatura();
		ac1.aumentarTemperatura();
		ac1.diminuirTemperatura();
		ac1.mudarModo("ventilar");
		ac1.mostrar();
	}

}
