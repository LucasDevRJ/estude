package br.com.github.lucasdevrj.estude;

public class Secao {

	private String nome;
	private String codigo;
	private int ordem;
	private boolean indicacaoAtiva = false;
	private boolean indicacaoProva = false;
	private Curso curso;
	
	public Secao(String nome, String codigo, Curso curso) {
		Validacao.validaDados(nome, codigo, curso);
		this.nome = nome;
		this.codigo = codigo;
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

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	public boolean isIndicacaoAtiva() {
		return indicacaoAtiva;
	}

	public void setIndicacaoAtiva(boolean indicacaoAtiva) {
		this.indicacaoAtiva = indicacaoAtiva;
	}

	public boolean isIndicacaoProva() {
		return indicacaoProva;
	}

	public void setIndicacaoProva(boolean indicacaoProva) {
		this.indicacaoProva = indicacaoProva;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Secao [nome=" + nome + ", codigo=" + codigo + ", ordem=" + ordem + ", indicacaoAtiva=" + indicacaoAtiva
				+ ", indicacaoProva=" + indicacaoProva + ", curso=" + curso + "]";
	}
	
	
}
