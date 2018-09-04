package strategy.imposto;

public class Teste {

	public static void main(String args[]) {		
		Imposto iccc = new ICCC();
		Orcamento orcamentoMenorQue1000 = new Orcamento(500.0);		
		Orcamento orcamentoEntre1000e3000 = new Orcamento(2500.0);
		Orcamento orcamentoMaiorQue3000 = new Orcamento(5000.0);

		CalculadorDeImpostos calc = new CalculadorDeImpostos();

		calc.realizarCalculo(orcamentoMenorQue1000, iccc);		
		calc.realizarCalculo(orcamentoEntre1000e3000, iccc);
		calc.realizarCalculo(orcamentoMaiorQue3000, iccc);
	}
}
