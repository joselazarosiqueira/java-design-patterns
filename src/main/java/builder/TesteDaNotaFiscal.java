package builder;

import java.time.LocalDate;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {
		NotaFiscal nf = new NotaFiscalBuilder()
				.paraEmpresa("Caelum")
				.comCnpj("123.456.789/0001-10")
				.com(new ItemDaNotaBuilder()
						.comDescricao("item 1")
						.comValor(100.0)
						.constroi())
				.com(new ItemDaNotaBuilder()
						.comDescricao("item 2")
						.comValor(200.0)
						.constroi())
				.com(new ItemDaNotaBuilder()
						.comDescricao("item 3")
						.comValor(300.0)
						.constroi())
				.comObservacoes("entregar nf pessoalmente")
				.naData(LocalDate.now())
				.constroi();
	}
}
