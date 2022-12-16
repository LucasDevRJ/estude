package br.com.github.lucasdevrj.estude;

public class Video extends TipoAtividade{

	private String url;
	private int minutos;
	private String transcricao;

	public Video(String titulo) {
		super(titulo);
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	public void setTranscricao(String transcricao) {
		this.transcricao = transcricao;
	}

	@Override
	public String toString() {
		return "Video [url=" + url + ", minutos=" + minutos + ", transcricao=" + transcricao + "]";
	}
	
	
}
