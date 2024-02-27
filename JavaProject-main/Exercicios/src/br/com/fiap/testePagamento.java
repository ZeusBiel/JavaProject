package br.com.fiap;

public class testePagamento {

	public static void main(String[] args) {
		
		pagamento pag = new pagamento();
		pag.salarioBruto = 5000;
		pag.numeroDeDependentes = 2;
		pag.descontoINSS = 10;
		pag.valorPlanoDeSaude = 50;
		
		pag.calcularSalarioLiquido(0, 0, 0);
		
	}

}
