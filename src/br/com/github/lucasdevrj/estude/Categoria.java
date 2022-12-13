package br.com.github.lucasdevrj.estude;

public class Categoria extends AtributosCategoria {

	private boolean indicacaoAtiva = false;
	private String urlImagem;
	private String hexadecimal;
	
	public Categoria(String nome, String codigo) {
		super(nome, codigo);
	}
	
	public void setIndicacaoAtiva(boolean indicacaoAtiva) {
		this.indicacaoAtiva = indicacaoAtiva;
	}
	
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	
	public void setHexadecimal(String hexadecimal) {
		this.hexadecimal = hexadecimal;
	}
	
	@Override
	public String toString() {
		return "Nome: " + super.getNome() + "\nCódigo: " + super.getCodigo()
		+ "\nDescrição: " + super.getDescricao() + "\nGuia: " + super.getGuia()
		+ "\nIndicação: " + this.indicacaoAtiva + "\nOrdem: " + super.getOrdem()
		+ "\nUrl Imagem: " + this.urlImagem + "\nHexadecimal: " 
		+ this.hexadecimal;
	}
}
