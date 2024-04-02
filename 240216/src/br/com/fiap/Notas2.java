package br.com.fiap;

import javax.swing.JOptionPane;

public class Notas2 {

	public static void main(String[] args) {
		
		float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite sua primeira nota: "); //Se eu quero ler o dado
			nota1 = Float.parseFloat(aux); //Conversão
			aux = JOptionPane.showInputDialog("Digite sua segunda nota: ");
			nota2 = Float.parseFloat(aux);
			aux = JOptionPane.showInputDialog("Digite sua terceira nota: ");
			nota3 = Float.parseFloat(aux);
			aux = JOptionPane.showInputDialog("Digite sua última nota: ");
			nota4 = Float.parseFloat(aux);
			
			JOptionPane.showMessageDialog(null, "Sua média é: " + (nota1 + nota2 + nota3 + nota4)/4); //Se eu quero mostrar o dado
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Número no formato incorreto");
		}

	}

}
