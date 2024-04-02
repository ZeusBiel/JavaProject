package br.com.fiap;

public class TesteFolhaDePagamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FolhaDePagamento fdp = new FolhaDePagamento();
		
		fdp.salarioBruto = 5000;
		fdp.numeroDeDependentes = 3;
		fdp.valorPlanoDeSaude = 600;
		fdp.descontoINSS = 20;
		
		fdp.calcularSalarioLiquido();
	}

}
