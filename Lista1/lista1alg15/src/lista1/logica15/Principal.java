package lista1.logica15;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Antes de o racionamento de energia ser decretado, quase ningu�m falava em quilowatts;
			mas, agora, todos incorporaram essa palavra em seu vocabul�rio.
			Sabendo-se que 100 quilowatts de energia custa um s�timo do sal�rio m�nimo,
			fazer um algoritmo que receba o valor do sal�rio m�nimo e a quantidade de quilowatts gasta por uma resid�ncia e calcule.
			Imprima:  
			Valor em reais de cada quilowatt
			Valor em reais a ser pago  
			O novo valor a ser pago por essa resid�ncia com um desconto de 10%  
		*/
		
		double salario,watt,quantidadewatt,aserpago,desconto;
		
		salario= Double.parseDouble(JOptionPane.showInputDialog("Valor do salario minimo."));	
		
		quantidadewatt= Double.parseDouble(JOptionPane.showInputDialog("Quilowatts gasto na residencia."));
		
		watt=(salario/7)/100;			
		
		JOptionPane.showMessageDialog(null,"O Valor do quilowatts e: "+watt);
		
		aserpago=watt*quantidadewatt;
		
		JOptionPane.showMessageDialog(null,"O Valor a ser pago e: "+aserpago);
		
		desconto=aserpago*0.90;
		
		JOptionPane.showMessageDialog(null,"O Valor a ser pago com desconto de 10% e: "+desconto);
	}

}
