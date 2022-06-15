package lista1.logica13;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Entrar com quatro números e imprimir a média ponderada, sabendo-se que os pesos são respectivamente: 1,2,3 e 4
		
		double peso1,peso2,peso3,peso4,n1,n2,n3,n4,media;
		peso1=1;
		peso2=2;
		peso3=3;
		peso4=4;
		
		n1= Double.parseDouble(JOptionPane.showInputDialog("Digite um numero."));
		n2= Double.parseDouble(JOptionPane.showInputDialog("Digite um numero."));
		n3= Double.parseDouble(JOptionPane.showInputDialog("Digite um numero."));
		n4= Double.parseDouble(JOptionPane.showInputDialog("Digite um numero."));
		
		media=(n1*peso1+n2*peso2+n3*peso3+n4*peso4)/(peso1+peso2+peso3+peso4);
		
		JOptionPane.showMessageDialog(null,"A media ponderada dos numeros e: "+media);
	}

}
