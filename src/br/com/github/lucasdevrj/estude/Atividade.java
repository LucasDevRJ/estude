package br.com.github.lucasdevrj.estude;

public abstract class Atividade {

	private String titulo;
	private String codigo;
	private String indicacao = "inativa";
	private int ordem;

	//variável deveria se chamr tipo e pode ser Explicacao, Video, questão, criar herança com uma classe chamada tipo de atividade
	private TipoAtividade tipo;
	private Secao secao;


	
}
