package br.com.github.lucasdevrj.estude;

public class Explicacao extends TipoAtividade {
	
	private String texto;
	
	public Explicacao(String titulo) {
		super(titulo);
	}
	
	public String getExplicacao() {
		return texto;
	}

	public void setExplicacao(String explicacao) {
		if (explicacao == null || explicacao.isEmpty()) {
			throw new IllegalArgumentException("Explicação inválida!");
		}
		this.texto = explicacao;
	}

	@Override
	public String toString() {
		return "Explicacao [explicacao=" + texto + "]";
	}
}
