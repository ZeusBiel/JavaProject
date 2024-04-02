package br.com.fiap;

import javax.swing.JOptionPane;

public class Retangulo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float lado = 0, altura = 0;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite lado do retângulo: "); //Se eu quero ler o dado
			lado = Float.parseFloat(aux); //Conversão
			aux = JOptionPane.showInputDialog("Digite a altura do retângulo: ");
			altura = Float.parseFloat(aux);
			
			JOptionPane.showMessageDialog(null, "A área do retângulo é: " + (altura * lado)); //Se eu quero mostrar o dado
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Número no formato incorreto");
		}
	}

}
