package br.com.senai.lista2poo;

public class AlgoritmoDois {
	private String projeto;
	private double valor;
	
	public void setProjeto(String projeto) {
		this.projeto=projeto;
	}
	public String getProjeto() {
		return projeto.toUpperCase();
	}
	
	public void setValor(double valor) {
		this.valor=valor;
	}
	public double getValor() {
		return valor*(1.10);
	}


	
}
