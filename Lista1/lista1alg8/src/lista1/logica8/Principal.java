package lista1.logica8;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Criar um algoritmo que leia nome, endere�o, telefone e mostre posteriormente
		
		String nome,endereco,telefone;
		
		nome=JOptionPane.showInputDialog("Digite seu nome.");
		endereco=JOptionPane.showInputDialog("Digite o seu endere�o.");
		telefone=JOptionPane.showInputDialog("Digite o numero de telefone.");
		
		JOptionPane.showMessageDialog(null,"Seus dados cadastrados s�o: "+"\r\n Nome: "+nome+ "\r\n endere�o: "+endereco+ "\r\n Telefone: "+telefone);
	}

}
