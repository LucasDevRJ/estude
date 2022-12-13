package br.com.github.lucasdevrj.estude;

public class Subcategoria {

	private String nome;
	private String codigo;
	private String descricao;
	private String guia;
	private String indicacao;
	private int ordem;
	private Categoria categoria;
	
	public Subcategoria(String nome, String codigo) {
		Validacao.validaDados(nome, codigo);
		this.nome = nome;
		this.codigo = codigo;
	}
}
