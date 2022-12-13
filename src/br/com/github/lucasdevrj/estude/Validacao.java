package br.com.github.lucasdevrj.estude;

public class Validacao {

	public static void validaDados(String nome, String codigo, int tempoHoras, Instrutor instrutor) {
		// Criar classe só para fazer validações
		if (nome == null || nome.isEmpty()) {
			// "Mudar para IllegalArgu... e adicionar mensagem de erro"
			throw new IllegalArgumentException("Nome inválido!");
		}

		if (codigo.isEmpty() || !codigo.matches("[a-z0-9-]+")) {
			// colocar mensagem de erro
			throw new IllegalArgumentException("Código inválido!");
		}

		if (tempoHoras < 1 || tempoHoras > 20) {
			throw new IllegalArgumentException("Horário inválido!");
		}
		// inverter condição
		if (instrutor == null) {
			throw new IllegalArgumentException("Instrutor inválido!");
		}
	}

	public static void validaDados(String nome, String codigo) {
		if (nome == null || nome.isEmpty()) {
			// "Mudar para IllegalArgu... e adicionar mensagem de erro"
			throw new IllegalArgumentException("Nome inválido!");
		}

		if (codigo.isEmpty() || !codigo.matches("[a-z0-9-]+")) {
			// colocar mensagem de erro
			throw new IllegalArgumentException("Código inválido!");
		}
	}

	public static void validaDados(Categoria categoria) {
		if (categoria == null) {
			throw new IllegalArgumentException("Categoria inválida!");
		}
	}
}
