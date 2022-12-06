package br.com.github.lucasdevrj.estude;

public class Explicacao {

	private String explicacao;
	
	public Explicacao(String explicacao) {
		if (explicacao.isEmpty() || explicacao == null) {
			throw new NullPointerException();
		}
		this.explicacao = explicacao;
	}
	
	public String getExplicacao() {
		return explicacao;
	}
	
	public void setExplicacao(String explicacao) {
		this.explicacao = explicacao;
	}
}
