package br.com.github.lucasdevrj.estude;

import java.util.Date;

public class Curso {

	private String nome;
	private String codigo;
	private Date tempoHoras;
	private Visibilidade visibilidade;
	private String publicoAlvo;
	private String instrutor;
	private String ementa;
	private String habilidadesDesenvolvidas;
	
	public Curso(String nome, String codigo, Date tempoHoras, Visibilidade visibilidade, String publicoAlvo, String instrutor, String ementa, String habilidadesDesenvolvidas) {
		if (nome.isEmpty() || nome == null) {
			throw new NullPointerException();
		}
		
		if (tempoHoras.getHours() < 1 && tempoHoras.getHours() > 20) {
			throw new IllegalArgumentException();
		}
		
		if (instrutor.isEmpty() || instrutor == null) {
			throw new NullPointerException();
		}
		
		this.nome = nome;
		this.codigo = codigo;
		this.tempoHoras = tempoHoras;
		this.publicoAlvo = publicoAlvo;
		this.instrutor = instrutor;
		this.ementa = ementa;
		this.habilidadesDesenvolvidas = habilidadesDesenvolvidas;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public Date getTempoHoras() {
		return tempoHoras;
	}
	
	public void setTempoHoras(Date tempoHoras) {
		this.tempoHoras = tempoHoras;
	}
	
	public Visibilidade getVisibilidade() {
		return visibilidade;
	}
	
	public void setVisibilidade(Visibilidade visibilidade) {
		this.visibilidade = visibilidade;
	}
	
	public String getPublicoAlvo() {
		return publicoAlvo;
	}
	
	public void setPublicoAlvo(String publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}
	
	public String getEmenta() {
		return ementa;
	}
	
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	
	public String getHabilidadesDesenvolvidas() {
		return habilidadesDesenvolvidas;
	}
	
	public void setHabilidadesDesenvolvidas(String habilidadesDesenvolvidas) {
		this.habilidadesDesenvolvidas = habilidadesDesenvolvidas;
	}
}
