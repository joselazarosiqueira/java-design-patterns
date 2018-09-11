package observer;

public class Multiplicador implements AcaoAposGerarNota {
	private final double fator;

	public Multiplicador(double fator) {
		this.fator = fator;
	}

	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Multiplicador: " + notaFiscal.getValorBruto() * this.fator);
	}
}