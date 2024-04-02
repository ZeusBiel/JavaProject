package br.com.fiap;

import javax.swing.JOptionPane;

public class Trapezio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float baseMaior = 0, altura = 0, baseMenor = 0;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite a maior base do trapézio: "); //Se eu quero ler o dado
			baseMaior = Float.parseFloat(aux); //Conversão
			aux = JOptionPane.showInputDialog("Digite a menor base do trapézio: "); //Se eu quero ler o dado
			baseMenor = Float.parseFloat(aux);
			aux = JOptionPane.showInputDialog("Digite a altura do trapézio: ");
			altura = Float.parseFloat(aux);
			
			JOptionPane.showMessageDialog(null, "A área do trapézio é: " + ((baseMaior + baseMenor) * altura) / 2); //Se eu quero mostrar o dado
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Número no formato incorreto");
		}
	}

}
