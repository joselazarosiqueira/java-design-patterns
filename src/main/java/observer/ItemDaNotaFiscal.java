package observer;

public class ItemDaNotaFiscal {

	private double valor;
	private String nome;

	public ItemDaNotaFiscal(double valor, String nome) {
		this.valor = valor;
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public ItemDaNotaFiscal(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
