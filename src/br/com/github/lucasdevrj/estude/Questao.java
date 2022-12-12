package br.com.github.lucasdevrj.estude;

public class Questao {
//Questão é um tipo de Atividade(classe abstrata)
	private String enunciado;
	private String tipo = "Resposta unica";
	
	public Questao(String enunciado, String tipo) {
		this.enunciado = enunciado;
		this.tipo = tipo;
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

	//toString()
}
