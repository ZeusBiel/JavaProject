package br.com.fiap;

import javax.swing.JOptionPane;

public class Triangulo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float base = 0, altura = 0;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite a base do triângulo: "); //Se eu quero ler o dado
			base = Float.parseFloat(aux); //Conversão
			aux = JOptionPane.showInputDialog("Digite a altura do triângulo: ");
			altura = Float.parseFloat(aux);
			
			JOptionPane.showMessageDialog(null, "A área do triângulo é: " + (altura * base)/2); //Se eu quero mostrar o dado
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Número no formato incorreto");
		}
	}

}
