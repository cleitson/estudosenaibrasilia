package lista2.logica9;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crie um algoritmo que leia que leia o nome de um cliente e seu n�vel de categoria:
		 * Bronze
		 * Prata
		 * Ouro
		 * Se o cliente � Bronze ir� mostrar que a lista de espera encerra em janeiro.
		 * Se o cliente � Prata ir� mostrar a mensagem �Lista de Espera encerra em julho� 
		 * Se o cliente � Ouro ir� mostrar a mensagem �N�o possui lista de espera� 
		 */
		
		String nome,rank;
		
		nome=JOptionPane.showInputDialog("Entre com o nome").toUpperCase();
		rank=JOptionPane.showInputDialog("Escolha o nivel da categoria entre: \n\r Bronze \n\r Prata \n Ouro").toUpperCase();
		
		JOptionPane.showMessageDialog(null,nome+"\n "+ rank);
		/*if(rank.contains("OURO")) {
			JOptionPane.showMessageDialog(null,"Lista de espera encerra em Janeiro");
		}else if (rank.contains("PRATA")) {
			JOptionPane.showMessageDialog(null,"Lista de espera encerra em Julho");
			
		}else if (rank.contains("BRONZE")) {
			JOptionPane.showMessageDialog(null,"N�o possui lista de espera");
		*/
		switch(rank) {
			case("OURO"):JOptionPane.showMessageDialog(null,"Lista de espera encerra em Janeiro");break;
			case("PRATA"):JOptionPane.showMessageDialog(null,"Lista de espera encerra em Julho");break;
			case("BRONZE"):JOptionPane.showMessageDialog(null,"N�o possui lista de espera");break;
			default:JOptionPane.showMessageDialog(null, "Nivel da categoria incorreto");;
			}
		}
	}
	


