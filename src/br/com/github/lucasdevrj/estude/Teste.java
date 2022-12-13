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
		System.out.println();
		
		Categoria categoria = new Categoria("Programação", "dkfjr345");
		categoria.setDescricao("Cursos de Programação");
		categoria.setGuia("Cursos de programação. Vão desde desenvolvimento front-end, back-end, mobile");
		categoria.setOrdem(1);
		categoria.setUrlImagem("data:image/jpeg;base64,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");
		categoria.setHexadecimal("#ff0000");
		System.out.println(categoria);
		System.out.println();
		
		Subcategoria subcategoria = new Subcategoria("Back-end", "dfgf12");
		categoria.setDescricao("Cursos de Programação Back-end");
		categoria.setGuia("Curos de programação Back-end Java");
		categoria.setOrdem(1);
		categoria.setUrlImagem("data:image/jpeg;base64,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");
		categoria.setHexadecimal("#ae0000");
		System.out.println(subcategoria);
		System.out.println();
	}

}
