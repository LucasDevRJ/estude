package br.com.github.lucasdevrj.estude;


public class Curso {

	private String nome;
	private String codigo;
	private int tempoHoras;
	private String visibilidade = "privado";
	private String publicoAlvo;
	private String instrutor;
	private String ementa;
	private String habilidadesDesenvolvidas;
	
	public Curso(String nome, String codigo, int tempoHoras, String visibilidade, String publicoAlvo, String instrutor, String ementa, String habilidadesDesenvolvidas) {
		if (nome == null || nome.isEmpty()) {
			throw new NullPointerException();
		}
		
		if (codigo.isEmpty() || !codigo.matches("[a-z0-9-]+")) {
			throw new IllegalArgumentException();
		}
		
		if (tempoHoras < 1 && tempoHoras > 20) {
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
	
	public int getTempoHoras() {
		return tempoHoras;
	}
	
	public void setTempoHoras(int tempoHoras) {
		this.tempoHoras = tempoHoras;
	}
	
	public String getVisibilidade() {
		return visibilidade;
	}
	
	public void setVisibilidade(String visibilidade) {
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
