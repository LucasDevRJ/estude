package br.com.github.lucasdevrj.estude;

public class Categoria extends AtributosCategoria {
	
	private String urlImagem;
	private String hexadecimal;
	
	public Categoria(String nome, String codigo) {
		super(nome, codigo);
	}
	
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	
	public void setHexadecimal(String hexadecimal) {
		this.hexadecimal = hexadecimal;
	}
	
	@Override
	public void setIndicacaoAtiva(boolean indicacaoAtiva) {
		super.setIndicacaoAtiva(false);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nURL de Imagem: " + this.urlImagem
		+ "\nHexadecimal: " + this.hexadecimal;
	}
}
