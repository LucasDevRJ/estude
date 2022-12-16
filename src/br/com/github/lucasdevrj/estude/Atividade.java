package br.com.github.lucasdevrj.estude;

public class Atividade {

	private String titulo;
	private String codigo;
	private boolean indicacaoAtiva = false;
	private int ordem;
	private TipoAtividade tipo;
	private Secao secao;
	
	public Atividade(String titulo, String codigo, Secao secao) {
		Validacao.validaDados(titulo, codigo, secao);
		this.titulo = titulo;
		this.codigo = codigo;
		this.secao = secao;
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

	public TipoAtividade getTipo() {
		return tipo;
	}

	public void setTipo(TipoAtividade tipo) {
		this.tipo = tipo;
	}

	public Secao getSecao() {
		return secao;
	}

	public void setSecao(Secao secao) {
		this.secao = secao;
	}

	@Override
	public String toString() {
		return "Atividade [titulo=" + titulo + ", codigo=" + codigo + ", indicacaoAtiva=" + indicacaoAtiva + ", ordem="
				+ ordem + ", tipo=" + tipo + ", secao=" + secao + "]";
	}
}
