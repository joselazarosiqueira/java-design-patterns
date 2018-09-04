package chainOfResponsability.banco;

public class RespostaEmPorcento implements Resposta {

	private Resposta outraResposta;

	RespostaEmPorcento(Resposta resposta) {
		this.outraResposta = resposta;
	}

	RespostaEmPorcento() {
		this.outraResposta = null; // nao recebi a proxima!
	}

	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.PORCENTO) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		} else {
			outraResposta.responde(req, conta);
		}
	}
}
