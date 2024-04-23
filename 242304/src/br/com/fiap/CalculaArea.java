package br.com.fiap;

import javax.swing.JOptionPane;

public class CalculaArea {

	public static void main(String[] args) {
		String aux, escolha = "sim";
		float area, lado, altura;
		int opcao;
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				aux = JOptionPane.showInputDialog("Qual area deseja calcular?"+"\n(1) Quadrado \n(2) Retangulo \n(3) Triangulo");
				opcao = Integer.parseInt(aux);
				switch (opcao) {
				case 1: {
					Quadrado quad;
					aux = JOptionPane.showInputDialog("Digite o valor do lado: ");
					lado = Float.parseFloat(aux);
					quad = new Quadrado(lado);
					area = quad.calculaArea();
					JOptionPane.showMessageDialog(null, "Area do Quadrado: "+area);
					break;
				}
				case 2:{
					Retangulo ret;
					aux = JOptionPane.showInputDialog("Digite o valor do lado: ");
					lado = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite o valor da altura: ");
					altura = Float.parseFloat(aux);
					ret = new Retangulo(lado, altura);
					area = ret.calculaArea();
					JOptionPane.showMessageDialog(null, "Area do Retangulo: "+area);
					break;
				}
				case 3:{
					Triangulo tri;
					aux = JOptionPane.showInputDialog("Digite o valor do lado: ");
					lado = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite o valor da altura: ");
					altura = Float.parseFloat(aux);
					tri = new Triangulo(lado, altura);
					area = tri.calculaArea();
					JOptionPane.showMessageDialog(null, "Area do Triangulo: "+area);
					break;
				}
				default:
					throw new IllegalArgumentException("Escolha incorrreta");
				}
				escolha = JOptionPane.showInputDialog("Deseja continuar? ");
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, e.getMessage());
			}
			
		}
		JOptionPane.showMessageDialog(null, "Fim do programa");

	}

}
