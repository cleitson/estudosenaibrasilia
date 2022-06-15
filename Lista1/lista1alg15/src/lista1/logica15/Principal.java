package lista1.logica15;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Antes de o racionamento de energia ser decretado, quase ninguém falava em quilowatts;
			mas, agora, todos incorporaram essa palavra em seu vocabulário.
			Sabendo-se que 100 quilowatts de energia custa um sétimo do salário mínimo,
			fazer um algoritmo que receba o valor do salário mínimo e a quantidade de quilowatts gasta por uma residência e calcule.
			Imprima:  
			Valor em reais de cada quilowatt
			Valor em reais a ser pago  
			O novo valor a ser pago por essa residência com um desconto de 10%  
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
