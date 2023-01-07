package br.com.github.lucasdevrj.estude;

public class Explicacao extends TipoAtividade {
	
	public Explicacao(String texto) {
		super(texto);
	}	
	
	
	@Override
	public String toString() {
		return "Explicacao [explicacao=" + super.getTexto() + "]";
	}
}
