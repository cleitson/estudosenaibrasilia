package lista1.logica24;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ler uma temperatura em graus cent�grados e apresent�-la convertida em graus Fahrenheit. A f�rmula de convers�o � :   c+160/5
		
		double tempcel,tempfah;
		
		tempcel=Double.parseDouble(JOptionPane.showInputDialog("Temperatura em graus Celcius."));
		
		tempfah=tempcel+160/5;
		
		JOptionPane.showMessageDialog(null,"A temperatura "+tempcel+" em graus celcius \n quando convertida para fahrenheit e igual a "+tempfah );
	}

}
