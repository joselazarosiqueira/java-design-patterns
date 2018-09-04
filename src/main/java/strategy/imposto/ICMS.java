package strategy.imposto;
public class ICMS implements Imposto{

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + 50.0;
	}
}
