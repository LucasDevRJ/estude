package br.com.github.lucasdevrj.estude;

public class Categoria extends AtributosCategoria {
	
	private String urlImagem;
	private String hexadecimal;
	
	public Categoria(String nome, String codigo) {
		super(nome, codigo);
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

	@Override
	public void setIndicacaoAtiva(boolean indicacaoAtiva) {
		super.setIndicacaoAtiva(false);
	}

	@Override
	public String toString() {
		return "Categoria [urlImagem=" + urlImagem + ", hexadecimal=" + hexadecimal + "]";
	}
	
	
}
