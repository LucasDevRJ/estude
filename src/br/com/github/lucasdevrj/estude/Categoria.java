package br.com.github.lucasdevrj.estude;

public class Categoria {

	private String nome;
	private String codigo;
	private String descricao;
	private String guia;
	private Indicacao indicacao;
	private Integer ordem;
	private String urlImagem;
	private String hexadecimal;
	
	public Categoria(String nome, String codigo, String descricao, String guia, Indicacao indicacao, Integer ordem, String urlImagem, String hexadecimal) {
		this.nome = nome;
		this.codigo = codigo;
		this.descricao = descricao;
		this.guia = guia;
		this.indicacao = indicacao;
		this.ordem = ordem;
		this.urlImagem = urlImagem;
		this.hexadecimal = hexadecimal;
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
	
	public Indicacao getIndicacao() {
		return indicacao;
	}
	
	public void setIndicacao(Indicacao indicacao) {
		this.indicacao = indicacao;
	}
	
	public Integer getOrdem() {
		return ordem;
	}
	
	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}
	
	public String getUrlImagem() {
		return urlImagem;
	}
	
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	
	public String getHexadecimal() {
		return hexadecimal;
	}
	
	public void setHexadecimal(String hexadecimal) {
		this.hexadecimal = hexadecimal;
	}
}
