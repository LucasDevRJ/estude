package br.com.github.lucasdevrj.estude;

public class Questao extends TipoAtividade {

	private String enunciado;
	private String tipo = "Resposta unica";
	
	public Questao(String titulo, String codigo) {
		super(titulo, codigo);
	}
	
	public String getEnunciado() {
		return enunciado;
	}
	
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Questao [enunciado=" + enunciado + ", tipo=" + tipo + "]";
	}
}
