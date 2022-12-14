package br.com.github.lucasdevrj.estude;

public abstract class AtributoCategoria {

	private String nome;
	private String codigo;
	private String descricao;
	private String guia;
	private boolean indicacaoAtiva;
	private int ordem;
	
	public AtributoCategoria(String nome, String codigo) {
		Validacao.validaPalavra(nome, "Nome Inválido!");
		Validacao.validaCodigo(codigo);
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getGuia() {
		return guia;
	}

	public void setGuia(String guia) {
		this.guia = guia;
	}

	public boolean isIndicacaoAtiva() {
		return indicacaoAtiva;
	}

	public void setIndicacaoAtiva(boolean indicacaoAtiva) {
		this.indicacaoAtiva = indicacaoAtiva;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	@Override
	public String toString() {
		return "AtributosCategoria [nome=" + nome + ", codigo=" + codigo + ", descricao=" + descricao + ", guia=" + guia
				+ ", indicacaoAtiva=" + indicacaoAtiva + ", ordem=" + ordem + "]";
	}

	
}
