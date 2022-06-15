package lista1.logica25;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: volume = 3.14159 * R² *altura  
		
		double volume,r,r2,altura,valor;
		
		volume=3.14159;
		r=Double.parseDouble(JOptionPane.showInputDialog("Valor de R"));
		r2=Math.pow(r, 2);
		altura=Double.parseDouble(JOptionPane.showInputDialog("Valor da altura"));
		
		valor=volume*r2*altura;
		
		JOptionPane.showMessageDialog(null, "O valor do volume e: "+valor);
	}

}
