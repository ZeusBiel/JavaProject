package br.com.fiap;

import javax.swing.JOptionPane;

public class Idade2 {

	public static void main(String[] args) {
		
		int anoNasc = 0, anoAtual = 0;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite o ano atual: "); //Se eu quero ler o dado
			anoAtual = Integer.parseInt(aux); //Conversão
			aux = JOptionPane.showInputDialog("Digite seu ano de nascimento: ");
			anoNasc = Integer.parseInt(aux);
			
			JOptionPane.showMessageDialog(null, "Sua idade é: " + (anoAtual - anoNasc)); //Se eu quero mostrar o dado
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Número no formato incorreto");
		}
	}

}
