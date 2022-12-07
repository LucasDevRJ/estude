package br.com.github.lucasdevrj.estude;

public class Teste {

	public static void main(String[] args) {
		Curso curso = null;
		Alternativa alternativa = null;
		Questao questao = null;
		
		try {
			curso = new Curso("Orientação a Objetos", "fdfd", 0, null, null, "Niko Steppat", null, null);
			questao = new Questao("O que é uma classe?", "Resposta única");
			alternativa = new Alternativa("Curso sobre Exceções em Java.", 0, "Sim", null, questao);
		} catch (NullPointerException | IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		System.out.println(curso.getNome());
		System.out.println(curso.getCodigo());
		System.out.println(alternativa.getQuestao());
		System.out.println(questao.getTipo());
	}

}
