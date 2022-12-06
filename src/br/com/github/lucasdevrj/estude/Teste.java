package br.com.github.lucasdevrj.estude;

import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		Curso curso = null;
		
		try {
			curso = new Curso("Orientação a Objetos", "", new Date(), Visibilidade.PUBLICO, "", "Niko Steppat", "", "");
		} catch (NullPointerException | IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		System.out.println(curso.getNome());
		System.out.println(curso.getCodigo());
	}

}
