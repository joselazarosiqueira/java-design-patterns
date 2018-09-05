package decorator.imposto;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateDeImpostoCondicional {

	public IHIT() {
	}

	public IHIT(Imposto outroImposto) {
		super(outroImposto);
	}

	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return temDoisItensComMesmoNomeNo(orcamento);
	}

	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100. + calculoDoOutroImposto(orcamento);
	}

	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (orcamento.getItens().size() * 0.01) + calculoDoOutroImposto(orcamento);
	}

	private boolean temDoisItensComMesmoNomeNo(Orcamento orcamento) {
		List<String> noOrcamento = new ArrayList<String>();

		for (Item item : orcamento.getItens()) {
			if (noOrcamento.contains(item.getNome()))
				return true;
			else
				noOrcamento.add(item.getNome());
		}

		return false;
	}
}