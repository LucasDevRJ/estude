package br.com.github.lucasdevrj.estude;

public class Instrutor {

	private String nome;
	
	public Instrutor(String nomeInstrutor) {
		this.nome = nomeInstrutor;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return this.nome;
	}
}
