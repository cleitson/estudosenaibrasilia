package br.senai.inovatech.aulaabstracao;

public class ContaCorrente extends Conta {
	
	

	@Override
	public double depositar() {
		return this.getSaldo()+this.getValor();
		
	}

	@Override
	public double sacar() {
		
		return	this.getValor()- this.getSaldo();
		
	}

	@Override
	public double verificarSaldo() {
		return this.getSaldo();
		
	}
	

	
	

}
