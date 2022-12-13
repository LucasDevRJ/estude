package br.com.github.lucasdevrj.estude;

public abstract class TipoAtividade {

	private String titulo;
	private String codigo;
	private boolean indicacaoAtiva;
	private int ordem;
	private Secao secao;
	
	public TipoAtividade(String titulo, String codigo) {
		Validacao.validaDados(titulo, codigo);
		this.titulo = titulo;
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
		return "TipoAtividade [titulo=" + titulo + ", codigo=" + codigo + ", indicacaoAtiva=" + indicacaoAtiva
				+ ", ordem=" + ordem + ", secao=" + secao + "]";
	}
	
	
}
