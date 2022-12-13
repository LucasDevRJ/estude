package br.com.github.lucasdevrj.estude;

public class Subcategoria extends AtributosCategoria {

	private Categoria categoria;
	
	public Subcategoria(String nome, String codigo) {
		super(nome, codigo);
	}
	
	public void setCategoria(Categoria categoria) {
		Validacao.validaDados(categoria);
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nCategoria: " + this.categoria;
	}
}
