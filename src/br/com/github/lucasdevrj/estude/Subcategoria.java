package br.com.github.lucasdevrj.estude;

public class Subcategoria extends AtributoCategoria {

	private Categoria categoria;
	
	public Subcategoria(String nome, String codigo) {
		super(nome, codigo);
	}
	
	public void setCategoria(Categoria categoria) {
		Validacao.validaCategoria(categoria);
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Subcategoria [categoria=" + categoria + "]";
	}
	
	
}
