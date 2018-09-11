package observer;

public class ItemDaNotaBuilder {
	private String descricao;
	private double valor;

	public ItemDaNotaBuilder comDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	public ItemDaNotaBuilder comValor(double valor) {
		this.valor = valor;
		return this;
	}

	public ItemDaNotaFiscal build() {
		return new ItemDaNotaFiscal(valor, descricao);
	}

}
