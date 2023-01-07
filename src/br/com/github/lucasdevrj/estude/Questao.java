package br.com.github.lucasdevrj.estude;

public class Questao extends TipoAtividade {

	private String tipo = "Resposta unica";

	public Questao(String enunciado) {
		super(enunciado);
	}

	
	public String getEnunciado() {
		return super.getTexto();
	}

	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Questao [enunciado=" + this.getEnunciado() + ", tipo=" + tipo + "]";
	}
}
