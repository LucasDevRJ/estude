package br.com.github.lucasdevrj.estude;

public class Teste {

	public static void main(String[] args) {
		Instrutor instrutor = new Instrutor();
		instrutor.setNome("Niko Steppat");
		
		Curso curso = new Curso("Java: OO", "afrg34ff", 10, instrutor);
		curso.setEmenta("Orientação a Objetos");
		curso.setPublicoAlvo("Todos");
		curso.setHabilidadesDesenvolvidas("Conhecimento em Orientação a Objetos");
		System.out.println(curso);
	}

}
