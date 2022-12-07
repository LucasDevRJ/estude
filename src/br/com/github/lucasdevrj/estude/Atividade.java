package br.com.github.lucasdevrj.estude;

public class Atividade {

	private String titulo;
	private String codigo;
	private String indicacao = "inativa";
	private int ordem;
	private Explicacao explicacao;
	private Secao secao;
	
	public Atividade(String titulo, String codigo, String indicacao, int ordem, Explicacao explicacao, Secao secao) {
		
		if (titulo.isEmpty() || titulo == null) {
			throw new NullPointerException();
		}
		
		if (codigo.isEmpty() || !codigo.matches("[a-z0-9-]+")) {
			throw new IllegalArgumentException();
		}
		
		if (secao.equals(null)) {
			throw new NullPointerException();
		}
		
		this.titulo = titulo;
		this.codigo = codigo;
		this.indicacao = indicacao;
		this.ordem = ordem;
		this.explicacao = explicacao;
		this.secao = secao;
	}

	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getIndicacao() {
		return indicacao;
	}
	
	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}
	
	public int getOrdem() {
		return ordem;
	}
	
	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}
	
	public Explicacao getExplicacao() {
		return explicacao;
	}
	
	public void setExplicacao(Explicacao explicacao) {
		this.explicacao = explicacao;
	}
	
	public Secao getSecao() {
		return secao;
	}
	
	public void setSecao(Secao secao) {
		this.secao = secao;
	}
}
