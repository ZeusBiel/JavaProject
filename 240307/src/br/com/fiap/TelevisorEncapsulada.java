package br.com.fiap;

public class TelevisorEncapsulada {

	//Atributos
	private int volume;
	private int canal;
	
	//getters e setters
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		try {
			if (volume >= 0 && volume <= 20) {
				this.volume = volume;
			} else {
				throw new Exception("O volume está fora da faixa permitida! (0 a 20)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		try {
			if (canal == 2 || canal == 4 || canal == 5 || canal == 7 || canal == 13) {
				this.canal = canal;
			} else {
				throw new Exception("O canal está fora da lista permitida! (2,4,5,7 ou 13)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//métodos
	public void aumentarVolume() {
		if (volume < 20) {
			volume++;
		}
	}
	public void diminuirVolume() {
		if (volume > 0) {
			volume--;
		}
	}
	public void mostrar() {
		System.out.println("Volume: " + getVolume() + "\nCanal: " + getCanal());
	}
}
