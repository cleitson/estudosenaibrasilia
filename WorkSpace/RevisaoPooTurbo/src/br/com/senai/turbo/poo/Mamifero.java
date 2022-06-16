package br.com.senai.turbo.poo;

public class Mamifero {
	private String nome,raca,porte,cor,tiposang,sexo;
	private int idade;
	private double peso,altura;
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) {
		this.idade=idade;
	}
	public int getIdade() {
		return idade;
	}
	public void setRaca(String raca) {
		this.raca=raca;
	}
	public String getRaca() {
		return raca;
	}
	
}
