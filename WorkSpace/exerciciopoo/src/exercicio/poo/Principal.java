//pricipal
package exercicio.poo;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		Nome m1 = new Nome();
				
		m1.setNomePessoa(JOptionPane.showInputDialog("escreva seu nome:"));		
		JOptionPane.showMessageDialog(null,"Nome digitado: "+ m1.getNomePessoa());
	}
}
