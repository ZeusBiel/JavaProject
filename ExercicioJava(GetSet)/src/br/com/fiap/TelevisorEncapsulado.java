package br.com.fiap;

public class TelevisorEncapsulado {
	private int volume;
	private int canal;
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		try {
			if (volume >= 0 && volume <= 100) {
				this.volume = volume;
			} else {
				throw new Exception("Volume fora da faixa "
						+ "permitida (0 a 100)");
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
				throw new Exception("Canal não disponível");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void aumentarVolume() {
		if (volume < 100) {
			volume++;
		}
	}
	public void diminuirVolume() {
		if (volume > 0) {	
			volume--;
		}
	}
	public void mostrar() {
		System.out.println("Volume: "+ getVolume() +
				"\nEstação: "+getCanal());
	}
	
}
