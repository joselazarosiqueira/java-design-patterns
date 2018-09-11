package observer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {
		List<AcaoAposGerarNota> listaDeAcoes = new ArrayList<>();

		listaDeAcoes.add(new EnviadorDeEmail());
		listaDeAcoes.add(new NotaFiscalDao());
		listaDeAcoes.add(new EnviadorDeSms());
		listaDeAcoes.add(new Impressora());

		listaDeAcoes.add(new Multiplicador(2));
		listaDeAcoes.add(new Multiplicador(3));
		listaDeAcoes.add(new Multiplicador(5.5));

		NotaFiscalBuilder builder = new NotaFiscalBuilder(listaDeAcoes);

		NotaFiscal nf = builder
				.paraEmpresa("Caelum")
				.comCnpj("123.456.789/0001-10")
				.com(new ItemDaNotaBuilder()
						.comDescricao("item 1")
						.comValor(100.0)
						.build())
				.com(new ItemDaNotaBuilder()
						.comDescricao("item 2")
						.comValor(200.0)
						.build())
				.com(new ItemDaNotaBuilder()
						.comDescricao("item 3")
						.comValor(300.0)
						.build())
				.comObservacoes("entregar nf pessoalmente")
				.naData(LocalDate.now())
				.build();
	}
}
