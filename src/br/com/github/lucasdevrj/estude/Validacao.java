package br.com.github.lucasdevrj.estude;

public class Validacao {

	public static void validaPalavra(String palavra, String mensagemDeErro) {
		if (palavra == null || palavra.isEmpty()) {
			throw new IllegalArgumentException(mensagemDeErro);
		}
	}

	public static void validaCodigo(String codigo) {
		if (codigo.isEmpty() || !codigo.matches("[a-z0-9-]+")) {
			throw new IllegalArgumentException("Código inválido!");
		}

	}

	public static void validaTempoHoras(int tempoHoras) {
		if (tempoHoras < 1 || tempoHoras > 20) {
			throw new IllegalArgumentException("Horário inválido!");
		}
	}


	public static void validaCategoria(Categoria categoria) {
		if (categoria == null) {
			throw new IllegalArgumentException("Categoria inválida!");
		}
	}
	
	public static void validaQuestao(Questao questao) {
		if (questao == null) {
			throw new IllegalArgumentException("Questão inválida!");
		}
	}

	public static void validaCurso(Curso curso) {
		if (curso == null) {
			throw new IllegalArgumentException("Curso inválido!");
		}
	}

	public static void validaSecao(Secao secao) {
		if (secao == null) {
			throw new IllegalArgumentException("Seção inválida!");
		}
	}
}