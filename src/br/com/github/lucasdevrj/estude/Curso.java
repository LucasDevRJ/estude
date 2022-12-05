package br.com.github.lucasdevrj.estude;

import java.util.Date;

public class Curso {

	private String nome;
	private String codigo;
	private Date tempoHoras;
	private String publicoAlvo;
	private String instrutor;
	private String ementa;
	private String habilidadesDesenvolvidas;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (this.nome.isEmpty() || this.nome == null) {
			throw new NullPointerException();
		}
		this.nome = nome;
	}
}
