package br.com.github.lucasdevrj.estude;

public class Video extends Atividade{

	private String url;
	private int minutos;
	private String transcricao;

	public Video(String titulo, String codigo) {
		super(titulo, codigo);
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
