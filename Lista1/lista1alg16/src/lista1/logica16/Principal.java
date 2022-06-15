package lista1.logica16;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Entrar com um nome e imprimir 
		 * Todo nome
		 * Primeiro caractere
		 * Ultimo caractere
		 * Do primeiro ate o terceiro
		 * Quarto caractere
		 * Todos menos o primeiro
		 * Os dois últimos 
		*/ 
		
		String nome=JOptionPane.showInputDialog("Digite um nome.");
		JOptionPane.showMessageDialog(null, nome);
		
		JOptionPane.showMessageDialog(null,"Primeira letra: "+nome.substring(0,1));
		
		JOptionPane.showMessageDialog(null,"Ultima letra: "+nome.substring(nome.length()- 1));
		
		JOptionPane.showMessageDialog(null,"Da primeira a terceira letra: "+nome.substring(0,3));
		
		JOptionPane.showMessageDialog(null,"Quarta letra: "+nome.charAt(3));
		
		JOptionPane.showMessageDialog(null,"Todas letras menos a primeira: "+nome.substring(1));
		
		JOptionPane.showMessageDialog(null,"As duas ultimas letras: "+nome.substring(nome.length()-2));
		
		
	}

}
