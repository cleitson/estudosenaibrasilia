package br.senai.inovatech.aulaabstracao;

public abstract class Conta {

	private double saldo;
	private double valor;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public abstract double depositar();
	public abstract double sacar();
	public abstract double verificarSaldo();
	
}
