package br.com.senai.lista1poo;

public class AlgoritmoUm {
	
	private String mensagem;
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getMensagem() {
		return mensagem;
	}
	
	public String tranformarMensagem(boolean tipo) {
		if(tipo == true) {
			return mensagem.toUpperCase();
		}else{
			return mensagem.toLowerCase();
		}
	}

}