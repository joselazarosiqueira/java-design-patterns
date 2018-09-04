package chainOfResponsability.banco;

public class RespostaEmXml implements Resposta {

	private Resposta outraResposta;

	RespostaEmXml(Resposta resposta) {
		this.outraResposta = resposta;
	}

	RespostaEmXml(){
		this.outraResposta = null;
	}

	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo() + "</saldo></conta>");
		} else {
			outraResposta.responde(req, conta);
		}
	}
}
