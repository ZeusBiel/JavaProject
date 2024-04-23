package br.com.fiap;

public class Triangulo extends Retangulo {
	public Triangulo() {
	}
	public Triangulo(float lado, float altura) {
		super.setLado(lado);
		super.setAltura(altura);
	}
	
	public float calculaArea() {
		float area = super.getLado()*super.getAltura()/2;
		return area;
	}
}
