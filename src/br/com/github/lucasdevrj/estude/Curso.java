package br.com.github.lucasdevrj.estude;


public class Curso {

	private String nome;
	private String codigo;
	private int tempoHoras;
	private boolean visibilidadePrivada = true;
	private String publicoAlvo;
	//Deve ser uma classe
	private Instrutor instrutor;
	private String ementa;
	private String habilidadesDesenvolvidas;
	
	//Criar construtor só com os atributos obrigatórios.
	public Curso(String nome, String codigo, int tempoHoras, Instrutor instrutor) {
		Validacao.validaDados(nome, codigo, tempoHoras, instrutor);
		this.nome = nome;
		this.codigo = codigo;
		this.tempoHoras = tempoHoras;
		this.instrutor = instrutor;
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
	
	public int getTempoHoras() {
		return tempoHoras;
	}
	
	public void setTempoHoras(int tempoHoras) {
		this.tempoHoras = tempoHoras;
	}
	
	public boolean isVisibilidadePrivada() {
		return visibilidadePrivada;
	}
	
	public void setVisibilidadePrivada(boolean visibilidadePrivada) {
		this.visibilidadePrivada = visibilidadePrivada;
	}
	
	public String getPublicoAlvo() {
		return publicoAlvo;
	}
	
	public void setPublicoAlvo(String publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}
	
	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}
	
	public Instrutor getInstrutor() {
		return instrutor;
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

	//Fazer o toString
}
