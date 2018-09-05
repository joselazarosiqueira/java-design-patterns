package decorator.imposto;

public class Teste {

	public static void main(String args[]) {
		Imposto impostos = new ImpostoMuitoAlto(new ISS(new ICMS()));

		Orcamento orcamento = new Orcamento(500.0);

		System.out.println(impostos.calcula(orcamento));
	}
}
