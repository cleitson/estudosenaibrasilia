package br.com.senai.lista2poo;

public class AlgoritmoNove {
	private String nome,categoria;
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return nome;
	}
	public void setCategoria(String categoria) {
		this.categoria=categoria;
	}
	public String getCategoria() {
		return categoria.toUpperCase();
	}
}

