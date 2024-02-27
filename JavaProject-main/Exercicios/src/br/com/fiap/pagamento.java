package br.com.fiap;

public class pagamento {

	public double salarioBruto;
	public int numeroDeDependentes;
	public double descontoINSS;
	public double valorPlanoDeSaude;

	
	public void calcularSalarioLiquido(double f, double p, double t) {
		t = (descontoINSS *salarioBruto)/100;
		p = valorPlanoDeSaude*(numeroDeDependentes+1);
		f = salarioBruto-t-p;
		System.out.println("Salário Líquido: "+f);
	}
}
