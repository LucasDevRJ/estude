package br.com.github.lucasdevrj.estude;

public abstract class AtributosCategoria {

	private String nome;
	private String codigo;
	private String descricao;
	private String guia;
	private int ordem;
	
	public AtributosCategoria(String nome, String codigo) {
		Validacao.validaDados(nome, codigo);
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setGuia(String guia) {
		this.guia = guia;
	}
}
