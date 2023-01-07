package br.com.github.lucasdevrj.estude;

public class Teste {

	public static void main(String[] args) {
		//Todos os erros já foram testados
//		Curso curso = new Curso("Java OO", "afrg34ff", 10, "");
		
		Questao questao = new Questao("dnfdjfdf");
		Explicacao explicacao = new Explicacao("dlskçfkf");
		Video video = new Video("dfdfdfddfdd");
		Atividade atividade = new Atividade("Java SE", "dfgdfdf334", null);
		atividade.setTipo(questao);

		
		System.out.println(atividade);
	}
}
