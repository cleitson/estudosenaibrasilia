package br.com.senai.aulaestatica;

public class Veiculo {

	private String descricao;
	private int qtde;
	
	private static int contador;
	
	public Veiculo() {
		contador=contador+1;
	}
	public Veiculo(String descricao, int qtde) {
		super();
		this.descricao = descricao;
		this.qtde = qtde;
		contador=contador+1;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDecricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public static int getContador() {
		return contador;
	}
	
	public static double VerCupom() {
		Double numero=null;
		if(Veiculo.getContador()==10) {
			numero= Math.random()*100;
		}
		return numero.shortValue();
	}
	
}
