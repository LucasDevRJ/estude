package br.com.github.lucasdevrj.estude;

public class Alternativa {

	private String texto;
	private int ordem;
	private boolean indicacaoCorreta;
	private String justificativa;
	private Questao questao;

	public Alternativa(String texto, boolean indicacaoCorreta, Questao questao) {
		Validacao.validaPalavra(texto, "Text inválido");
		Validacao.validaQuestao(questao);
		this.texto = texto;
		this.indicacaoCorreta = indicacaoCorreta;
		this.questao = questao;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	public boolean isIndicacaoCorreta() {
		return indicacaoCorreta;
	}

	public void setIndicacaoCorreta(boolean indicacaoCorreta) {
		this.indicacaoCorreta = indicacaoCorreta;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public Questao getQuestao() {
		return questao;
	}

	public void setQuestao(Questao questao) {
		this.questao = questao;
	}

	@Override
	public String toString() {
		return "Alternativa [texto=" + texto + ", ordem=" + ordem + ", indicacaoCorreta=" + indicacaoCorreta
				+ ", justificativa=" + justificativa + ", questao=" + questao + "]";
	}
}
