package br.com.github.lucasdevrj.estude;

public class Categoria {

	private String nome;
	private String codigo;
	private String descricao;
	private String guia;
	private boolean indicacaoAtiva = false;
	private int ordem;
	private String urlImagem;
	private String hexadecimal;
	
	public Categoria(String nome, String codigo) {
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
	
	public void setIndicacaoAtiva(boolean indicacaoAtiva) {
		this.indicacaoAtiva = indicacaoAtiva;
	}
	
	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}
	
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	
	public void setHexadecimal(String hexadecimal) {
		this.hexadecimal = hexadecimal;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nCódigo: " + this.codigo
		+ "\nDescrição: " + this.descricao + "\nGuia: " + this.guia
		+ "\nIndicação: " + this.indicacaoAtiva + "\nOrdem: " + this.ordem
		+ "\nUrl Imagem: " + this.urlImagem + "\nHexadecimal: " 
		+ this.hexadecimal;
	}
}
