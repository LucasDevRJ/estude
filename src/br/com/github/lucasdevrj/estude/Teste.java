package br.com.github.lucasdevrj.estude;

public class Teste {

	public static void main(String[] args) {
		Curso curso = null;
		
		try {
			curso = new Curso("Orientação a Objetos", "fdfd", 0, null, null, "Niko Steppat", null, null);
		} catch (NullPointerException | IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		System.out.println(curso.getNome());
		System.out.println(curso.getCodigo());
	}

}
