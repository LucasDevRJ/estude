package br.com.github.lucasdevrj.estude;

public abstract class TipoAtividade {

	private String titulo;
	private boolean indicacaoAtiva;
	private int ordem;
	private Secao secao;
	
	public TipoAtividade(String titulo) {
		Validacao.validaPalavra(titulo, "Título inválido");
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	public Secao getSecao() {
		return secao;
	}

	public void setSecao(Secao secao) {
		this.secao = secao;
	}

	@Override
	public String toString() {
		return "TipoAtividade [titulo=" + titulo + ", indicacaoAtiva=" + indicacaoAtiva + ", ordem=" + ordem
				+ ", secao=" + secao + "]";
	}
	
}
