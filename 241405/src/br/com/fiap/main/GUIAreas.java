package br.com.fiap.main;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIAreas{
	
	private JLabel lblado, lbaltura, lbimagem;
	private JTextArea taResultados;
	private JTextField tfLado, tfAltura;
	private JButton btQuadrado, btRetangulo, btTriangulo;
	private ImageIcon imagem1;
	
	public GUIAreas() {
		inicializarComponentes();
		definirEventos();
	}
}
