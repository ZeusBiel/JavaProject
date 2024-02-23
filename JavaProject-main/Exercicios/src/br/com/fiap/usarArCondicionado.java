package br.com.fiap;

public class usarArCondicionado {

	public static void main(String[] args) {
		arCondicionado Ar = new arCondicionado();
		Ar.temperatura = 18;
		Ar.modo = "Frio";
		Ar.mostrar();
		
		Ar.aumentarTemperatura();
		Ar.aumentarTemperatura();
		Ar.aumentarTemperatura();
		Ar.modo = "Quente";
		Ar.mostrar();
	}

}
