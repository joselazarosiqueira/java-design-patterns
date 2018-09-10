package state.banco;

public interface EstadoDaConta {

	public void saca(Conta conta, double valor);

	public void deposita(Conta conta, double valor);
}
