package br.com.github.lucasdevrj.estude;

public class Secao {

	private String nome;
	private String codigo;
	private int ordem;
	private String indicacaoAtiva = "inativa";
	private String indicacaoProva = "não";
	private Curso curso;
	
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
	
	public int getOrdem() {
		return ordem;
	}
	
	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}
	
	public String getIndicacaoAtiva() {
		return indicacaoAtiva;
	}
	
	public void setIndicacaoAtiva(String indicacaoAtiva) {
		this.indicacaoAtiva = indicacaoAtiva;
	}
	
	public String getIndicacaoProva() {
		return indicacaoProva;
	}
	
	public void setIndicacaoProva(String indicacaoProva) {
		this.indicacaoProva = indicacaoProva;
	}
	
	public Curso getCurso() {
		return curso;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
