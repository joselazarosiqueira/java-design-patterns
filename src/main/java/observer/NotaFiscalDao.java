package observer;

public class NotaFiscalDao implements AcaoAposGerarNota {

	public void executa(NotaFiscal notaFiscal) {
		System.out.println("salvando no banco");
	}
}