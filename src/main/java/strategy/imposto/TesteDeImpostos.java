package strategy.imposto;

public class TesteDeImpostos {
	
	public static void main(String args[]) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Orcamento orcamento = new Orcamento(500.0);

		CalculadorDeImpostos calc = new CalculadorDeImpostos();

		calc.realizarCalculo(orcamento, iss);
		calc.realizarCalculo(orcamento, icms);
	}
}
