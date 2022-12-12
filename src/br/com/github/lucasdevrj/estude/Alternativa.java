package br.com.github.lucasdevrj.estude;

public class Alternativa {

	private String texto;
	private int ordem;
	private String indicacao;
	private String justificativa;
	private Questao questao;

	//construtor com atributos obrigatórios
	public Alternativa(String texto, int ordem, String indicacao, String justificativa, Questao questao) {
		//classe com validações
		if (texto.isEmpty() || texto == null) {
			throw new NullPointerException();
		}
		
		if (indicacao.isEmpty() || indicacao == null) {
			throw new NullPointerException();
		}
		
		if (questao.equals(null)) {
			throw new NullPointerException();
		}
		
		this.texto = texto;
		this.ordem = ordem;
		this.indicacao = indicacao;
		this.justificativa = justificativa;
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
	
	public String getIndicacao() {
		return indicacao;
	}
	
	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
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

	//toString
}
