package br.com.github.lucasdevrj.estude;

public abstract class AtributosCategoria {

	private String nome;
	private String codigo;
	private String descricao;
	private String guia;
	private boolean indicacaoAtiva;
	private int ordem;
	
	public AtributosCategoria(String nome, String codigo) {
		Validacao.validaDados(nome, codigo);
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setGuia(String guia) {
		this.guia = guia;
	}
	
	public String getGuia() {
		return guia;
	}
	
	public void setIndicacaoAtiva(boolean indicacaoAtiva) {
		this.indicacaoAtiva = indicacaoAtiva;
	}
	
	public boolean isIndicacaoAtiva() {
		return indicacaoAtiva;
	}
	
	public int getOrdem() {
		return ordem;
	}
	
	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nCódigo: " + this.codigo
		+ "\nDescrição: " + this.descricao + "\nGuia: " + this.guia
		+ "\nIndicação: " + this.indicacaoAtiva + "\nOrdem: " + this.ordem;
	}
}
