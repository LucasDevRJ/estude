package br.com.github.lucasdevrj.estude;

public abstract class TipoAtividade {
	private String texto;

	public TipoAtividade (String texto) {
		Validacao.validaPalavra(texto, "Texto inválido");
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}	
}
