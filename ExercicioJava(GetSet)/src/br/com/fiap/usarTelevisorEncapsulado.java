package br.com.fiap;

public class usarTelevisorEncapsulado {

	public static void main(String[] args) {
		TelevisorEncapsulado tv1 = new TelevisorEncapsulado();
		
		tv1.setCanal(5);
		tv1.setVolume(42);
		tv1.mostrar();
		
		tv1.aumentarVolume();
		tv1.aumentarVolume();
		tv1.setCanal(13);
		tv1.mostrar();

	}

}
