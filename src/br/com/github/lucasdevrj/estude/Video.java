package br.com.github.lucasdevrj.estude;

public class Video extends TipoAtividade{

	private int minutos;
	private String transcricao;

	public Video(String url) {
		super(url);
	}
	
	public String getUrl() {
		return super.getTexto();
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	public void setTranscricao(String transcricao) {
		this.transcricao = transcricao;
	}

	@Override
	public String toString() {
		return "Video [url=" + this.getUrl() + ", minutos=" + minutos + ", transcricao=" + transcricao + "]";
	}
	
	
}
