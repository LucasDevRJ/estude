package br.com.github.lucasdevrj.estude;

public class Video {

	private String url;
	private int minutos;
	private String transcricao;

	public Video(String url) {
		Validacao.validaDados(url);
		this.url = url;
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
