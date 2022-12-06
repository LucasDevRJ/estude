package br.com.github.lucasdevrj.estude;

public class Teste {

	public static void main(String[] args) {
		Curso curso = new Curso();
		try {
			curso.setNome("Orientação a Objetos");
		} catch (NullPointerException | IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		System.out.println(curso.getNome());
	}

}
