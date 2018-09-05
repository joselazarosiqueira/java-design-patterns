package decorator.banco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FiltroMesmoMes extends Filtro {

	public FiltroMesmoMes(Filtro outroFiltro) {
		super(outroFiltro);
	}

	public FiltroMesmoMes() {
		super();
	}

	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
		for (Conta c : contas) {
			if (c.getDataAbertura().getMonth() == LocalDate.now().getMonth() &&
					c.getDataAbertura().getYear() == LocalDate.now().getYear()) {
				filtrada.add(c);
			}
		}

		filtrada.addAll(proximo(contas));
		return filtrada;
	}
}