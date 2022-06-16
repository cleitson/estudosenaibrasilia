package br.com.senai.aulaestatica;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Veiculo v1=new Veiculo();
		v1.setDecricao("Onix");
		v1.setQtde(80);
		
		Veiculo v2=new Veiculo();
		v2.setDecricao("HB20");
		v2.setQtde(80);
		
		Veiculo v3=new Veiculo();
		v3.setDecricao("Etios");
		v3.setQtde(80);
		
		
		Veiculo v4=new Veiculo("Ford Ka",60);
		Veiculo v5=new Veiculo("Ford Ka",60);
		Veiculo v6=new Veiculo("Ford Ka",60);
		Veiculo v7=new Veiculo("Ford Ka",60);
		Veiculo v8=new Veiculo("Ford Ka",60);
		Veiculo v9=new Veiculo("Ford Ka",60);
		Veiculo v10=new Veiculo("Ford Ka",60);
		System.out.println("Qtde de Veiculos: "+(Veiculo.getContador()));
		
		System.out.printf("numero sorteado:%.0f ", Veiculo.VerCupom());
	}
	
	

}
