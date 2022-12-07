package br.com.github.lucasdevrj.estude;

public class Questao {

	private String enunciado;
	private String tipo = "Resposta unica";
	
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
}
