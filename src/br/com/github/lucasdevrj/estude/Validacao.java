package br.com.github.lucasdevrj.estude;

public class Validacao {

	public static void validaDados(Curso curso) {
		// Criar classe só para fazer validações
		if (curso.getNome() == null || curso.getNome().isEmpty()) {
			// "Mudar para IllegalArgu... e adicionar mensagem de erro"
			throw new NullPointerException("Nome inválido!");
		}

		if (curso.getCodigo().isEmpty() || !curso.getCodigo().matches("[a-z0-9-]+")) {
			// colocar mensagem de erro
			throw new IllegalArgumentException("Código inválido!");
		}

		if (curso.getTempoHoras() < 1 && curso.getTempoHoras() > 20) {
			throw new IllegalArgumentException("Tempo inválido!");
		}
		// inverter condição
		if (curso.getInstrutor() == null || curso.getInstrutor().isEmpty()) {
			throw new NullPointerException("Instrutor inválido!");
		}
	}
}
