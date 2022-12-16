package br.com.github.lucasdevrj.estude;

public class Explicacao extends TipoAtividade {
	
	private String explicacao;
	
	public Explicacao(String titulo) {
		super(titulo);
	}
	
	public String getExplicacao() {
		return explicacao;
	}

	public void setExplicacao(String explicacao) {
		if (explicacao == null || explicacao.isEmpty()) {
			throw new IllegalArgumentException("Explicação inválida!");
		}
		this.explicacao = explicacao;
	}

	@Override
	public String toString() {
		return "Explicacao [explicacao=" + explicacao + "]";
	}
}
