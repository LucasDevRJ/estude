package br.com.github.lucasdevrj.estude;

public class Video {

	private String url;
	private int minutos;
	private String transcricao;
	
	public Video(String url, int minutos, String transcricao) {
		
		if (url.isEmpty() || url == null) {
			throw new NullPointerException();
		}
		
		this.url = url;
		this.minutos = minutos;
		this.transcricao = transcricao;
	}

	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public int getMinutos() {
		return minutos;
	}
	
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	public String getTranscricao() {
		return transcricao;
	}
	
	public void setTranscricao(String transcricao) {
		this.transcricao = transcricao;
	}
}
