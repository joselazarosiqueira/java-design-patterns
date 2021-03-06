package builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscalBuilder {
	private String razaoSocial;
	private String cnpj;
	private double valorTotal;
	private double impostos;
	private LocalDate data;
	private List<ItemDaNotaFiscal> todosItens = new ArrayList<>();

	private double valorBruto;
	private String observacoes;

	public NotaFiscal constroi() {
		return new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder com(ItemDaNotaFiscal item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	public NotaFiscalBuilder naData(LocalDate date) {
		this.data = date;
		return this;
	}
}
