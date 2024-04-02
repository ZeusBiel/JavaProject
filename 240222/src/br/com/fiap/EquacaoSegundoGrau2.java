package br.com.fiap;

import javax.swing.JOptionPane;

public class EquacaoSegundoGrau2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0, b = 0, c = 0;
		double resultado1 = 0, resultado2 = 0, delta = 0;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite o valor de A: "); //Se eu quero ler o dado
			a = Integer.parseInt(aux); //Conversão
			aux = JOptionPane.showInputDialog("Digite o valor de B: ");
			b = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite o valor de C: ");
			c = Integer.parseInt(aux);
			
			delta = (b * b)-4 * a * c;
			resultado1 = ((-b + Math.sqrt(delta))/ (2*a)); 
			resultado2 = ((-b - Math.sqrt(delta))/ (2*a));
			JOptionPane.showMessageDialog(null,"Resultado 1: " + resultado1 + "\nResultado 2: " + resultado2);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Número no formato incorreto");
		}
	}

}
