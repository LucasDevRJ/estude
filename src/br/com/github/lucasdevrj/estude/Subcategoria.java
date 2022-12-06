package br.com.github.lucasdevrj.estude;

public class Subcategoria {

	private String nome;
	private String codigo;
	private String descricao;
	private String guia;
	private String indicacao;
	private int ordem;
	private Categoria categoria;
	
	public Subcategoria(String nome, String codigo, String descricao, String guia, String indicacao, int ordem, Categoria categoria) {
		
		if (nome.isEmpty() || nome == null) {
			throw new NullPointerException();
		}
		
		if (codigo.isEmpty() || !codigo.matches("[a-z]+")) {
			throw new IllegalArgumentException();
		}
		
		this.nome = nome;
		this.codigo = codigo;
		this.descricao = descricao;
		this.guia = guia;
		this.indicacao = indicacao;
		this.ordem = ordem;
		this.categoria = categoria;
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
	
	public String getIndicacao() {
		return indicacao;
	}
	
	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}
	
	public int getOrdem() {
		return ordem;
	}
	
	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
