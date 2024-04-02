package br.com.fiap;

public class FolhaDePagamento {

	public double salarioBruto, valorPlanoDeSaude, salario;
	public int numeroDeDependentes, descontoINSS;
	
	public double calcularSalarioLiquido() {
		salario = salarioBruto - ((1 + numeroDeDependentes) * valorPlanoDeSaude) - (salarioBruto * descontoINSS / 100);
		System.out.println(salario);
		return salario;
	}
}
