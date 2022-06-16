package br.com.senai.avaliacao;

public class Artista {
	
	
	private int id;
	private String nome;
	
	
	
	public Artista() {
		super();
	}
	
	
	public Artista(int id) {
		super();
		this.id = id;
	}


	public Artista(String nome) {
		super();
		this.nome = nome;
	}


	public Artista(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void gravarNoBanco() {
		
	}
	
}
