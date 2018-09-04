package templateMethod.imposto;

public class Teste {

	public static void main(String args[]) {		
		Imposto icpp = new ICPP();
		Imposto ikcv = new IKCV();

		Orcamento orcamentoMenorQue500 = new Orcamento(400.0);
		Orcamento orcamentoEntre1000e3000 = new Orcamento(2500.0);
		Orcamento orcamentoMaiorQue3000 = new Orcamento(5000.0);

		CalculadorDeImpostos calc = new CalculadorDeImpostos();

		calc.realizarCalculo(orcamentoMenorQue500, icpp);
		calc.realizarCalculo(orcamentoEntre1000e3000, icpp);
		calc.realizarCalculo(orcamentoMaiorQue3000, icpp);

		calc.realizarCalculo(orcamentoMenorQue500, ikcv);
		calc.realizarCalculo(orcamentoEntre1000e3000, ikcv);
		calc.realizarCalculo(orcamentoMaiorQue3000, ikcv);
	}
}
