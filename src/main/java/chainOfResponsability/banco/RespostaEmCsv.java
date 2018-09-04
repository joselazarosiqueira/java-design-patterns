package chainOfResponsability.banco;

public class RespostaEmCsv implements Resposta {

	private Resposta outraResposta;

	RespostaEmCsv(Resposta resposta) {
		this.outraResposta = resposta;
	}

	RespostaEmCsv() {
		this.outraResposta = null;
	}

	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular() + "," + conta.getSaldo());
		} else {
			outraResposta.responde(req, conta);
		}
	}
}
