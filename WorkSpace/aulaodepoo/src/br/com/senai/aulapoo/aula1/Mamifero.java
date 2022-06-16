package br.com.senai.aulapoo.aula1;

/*
 *Uma classe e um conjunto de objetos
 *O que que uma classe tem?
 */
public class Mamifero {
	
	//Oque e um atributo: Atributo é uma caracterista de um objeto
	 private String nomeCientifico;
	 private String nomePopular;
	
	//Construtor
	 
	 
	 //Método set get: Metodos são ações do Objeto
	 public void setNomeCientifico(String nomeCientifico) {
		 this.nomeCientifico = nomeCientifico;
	 
	 }
	 
	 
	 public String getNomeCientifico() {
		 return this.nomeCientifico;
		 /*
		  * modificador de acesso
		  * public - private - protected - package
		  * 
		  * tipo de retorno: void, int, float, double, string, bigdecimal*/
	 }
	 
}
