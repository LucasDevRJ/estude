package br.com.github.lucasdevrj.estude;

public class Alternativa {

	private String texto;
	private int ordem;
	private boolean indicacaoCorreta;
	private String justificativa;
	private Questao questao;

	public Alternativa(String texto, boolean indicacaoCorreta, Questao questao) {
		Validacao.validaDados(texto, indicacaoCorreta, questao);
	}
}
