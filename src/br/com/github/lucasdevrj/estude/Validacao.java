package br.com.github.lucasdevrj.estude;

public class Validacao {

	public static void validaDados(String nome, String codigo, int tempoHoras, String instrutor) {
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
		if (instrutor == null || instrutor.isEmpty()) {
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

	public static void validaDados(String url) {
		if (url == null || url.isEmpty()) {
			throw new IllegalArgumentException("Categoria inválida!");
		}
	}

	public static void validaDados(String texto, boolean indicacaoCorreta, Questao questao) {
		if (texto == null || texto.isEmpty()) {
			// "Mudar para IllegalArgu... e adicionar mensagem de erro"
			throw new IllegalArgumentException("Texto inválido!");
		}

		if (indicacaoCorreta != true || indicacaoCorreta != false) {
			// colocar mensagem de erro
			throw new IllegalArgumentException("Indicação inválida!");
		}
  
		if (questao == null) {
			throw new IllegalArgumentException("Questão inválida!");
		}
	}

	public static void validaDados(String nome, String codigo, Curso curso) {
		if (nome == null || nome.isEmpty()) {
			// "Mudar para IllegalArgu... e adicionar mensagem de erro"
			throw new IllegalArgumentException("Nome inválido!");
		}

		if (codigo.isEmpty() || !codigo.matches("[a-z0-9-]+")) {
			// colocar mensagem de erro
			throw new IllegalArgumentException("Código inválido!");
		}
  
		if (curso == null) {
			throw new IllegalArgumentException("Curso inválido!");
		}
	}

	public static void validaDados(String titulo, String codigo, Secao secao) {
		if (titulo == null || titulo.isEmpty()) {
			// "Mudar para IllegalArgu... e adicionar mensagem de erro"
			throw new IllegalArgumentException("titulo inválido!");
		}

		if (codigo.isEmpty() || !codigo.matches("[a-z0-9-]+")) {
			// colocar mensagem de erro
			throw new IllegalArgumentException("Código inválido!");
		}
  
		if (secao == null) {
			throw new IllegalArgumentException("Seção inválida!");
		}
	}
}
