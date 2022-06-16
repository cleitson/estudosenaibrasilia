package br.com.jeduk.jlink;

public class Link {
	
	private int id;
	private String descricao;
	private String  url;
	
	public Link() {
		
	}
	public Link(int id,String descricao, String url) {
		this.id=id;
		this.descricao=descricao;
		this.url= url;
	}
	public Link(String descricao,String url) {
		this.descricao=descricao;
		this.url=url;
	}
	public Link(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	
}
