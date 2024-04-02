package br.com.fiap;

import javax.swing.JOptionPane;

public class Area2 {

	public static void main(String[] args) {
		
		float raio = 0;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite o raio do círculo:  "); //Se eu quero ler o dado
			raio = Float.parseFloat(aux); //Conversão
			
			JOptionPane.showMessageDialog(null, "O raio deste círculo é: " + (raio * raio) * 3.14); //Se eu quero mostrar o dado
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Número no formato incorreto");
		}

	}

}
