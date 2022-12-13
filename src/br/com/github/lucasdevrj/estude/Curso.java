package br.com.github.lucasdevrj.estude;

public class Curso {

	private String nome;
	private String codigo;
	private int tempoHoras;
	private boolean visibilidadePrivada = true;
	private String publicoAlvo;
	private Instrutor instrutor;
	private String ementa;
	private String habilidadesDesenvolvidas;

	public Curso(String nome, String codigo, int tempoHoras, Instrutor instrutor) {
		Validacao.validaDados(nome, codigo, tempoHoras, instrutor);
		this.nome = nome;
		this.codigo = codigo;
		this.tempoHoras = tempoHoras;
		this.instrutor = instrutor;
	}
	
	public void setVisibilidadePrivada(boolean visibilidadePrivada) {
		this.visibilidadePrivada = visibilidadePrivada;
	}
	
	public void setPublicoAlvo(String publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}
	
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	
	public void setHabilidadesDesenvolvidas(String habilidadesDesenvolvidas) {
		this.habilidadesDesenvolvidas = habilidadesDesenvolvidas;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nCódigo: " + this.codigo
		+ "\nDuração: " + this.tempoHoras + "\nPrivado: " + 
	    this.visibilidadePrivada + "\nPúblico Alvo: " + this.publicoAlvo
		+ "\nInstrutor: " + this.instrutor + "\nEmenta: " + this.ementa
		+ "\nHabilidades Desenvolvidas: " + this.habilidadesDesenvolvidas;
	}
}
