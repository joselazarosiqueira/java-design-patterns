package chainOfResponsability.desconto;

public interface Desconto {
	double desconta(Orcamento orcamento);
	
	void setProximo(Desconto desconto);
}
