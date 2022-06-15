package lista1.logica20;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Entrar com os lados a,b,c de um paralelepípedo. Calcular e imprimir a diagonal.
		
		double a,b,c,diagonal;
		
		a=Double.parseDouble(JOptionPane.showInputDialog("Entre com um lado do paralelepipedo."));
		b=Double.parseDouble(JOptionPane.showInputDialog("Entre com um lado do paralelepipedo."));
		c=Double.parseDouble(JOptionPane.showInputDialog("Entre com um lado do paralelepipedo."));
		
		diagonal=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2));
		JOptionPane.showMessageDialog(null,"A diagonal do paralelepipedo e: "+diagonal);
	}

}
