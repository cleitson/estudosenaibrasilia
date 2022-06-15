package lista1.logica8;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Criar um algoritmo que leia nome, endereço, telefone e mostre posteriormente
		
		String nome,endereco,telefone;
		
		nome=JOptionPane.showInputDialog("Digite seu nome.");
		endereco=JOptionPane.showInputDialog("Digite o seu endereço.");
		telefone=JOptionPane.showInputDialog("Digite o numero de telefone.");
		
		JOptionPane.showMessageDialog(null,"Seus dados cadastrados são: "+"\r\n Nome: "+nome+ "\r\n endereço: "+endereco+ "\r\n Telefone: "+telefone);
	}

}
