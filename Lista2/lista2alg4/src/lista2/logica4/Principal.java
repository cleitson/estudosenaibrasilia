package lista2.logica4;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crie um algoritmo que leia o nome do cliente, um código de matrícula.
		 * A matrícula estará no formato CCAAMMFFG.
		 * CC: Código de duas letras equivalente à concessionária que o cliente está associado;
		 * AA: Dois dígitos equivalentes ao ano da data de matrícula do cliente;
		 * MM: Dois dígitos equivalentes ao mês da data de matrícula do cliente;
		 * FF: Equivale ao nível da categoria do cliente (00 para Bronze, 01 para Prata, 02 para Ouro, 03 para Diamante);
		 * G: Gênero do cliente (M para Masculino, F para Feminino, N para Não definido, O para Outro).
		 * Depois utilize substring para tirar o ano da data de matrícula do cliente.
		 * Se o ano for abaixo de 22, mostre uma mensagem: “Não é desse ano essa matricula”. 
		 */
		
		String matricula;
		int ano;
		
		matricula=JOptionPane.showInputDialog("Entre com os dados da matricula no seguinte formato:CCAAMMFFG \n "
				+ "CC: Código de duas letras equivalente à concessionária que o cliente está associado; \n"
				+ "AA: Dois dígitos equivalentes ao ano da data de matrícula do cliente; \n"
				+ "MM: Dois dígitos equivalentes ao mês da data de matrícula do cliente; \n"
				+ "FF: Equivale ao nível da categoria do cliente (00 para Bronze, 01 para Prata, 02 para Ouro, 03 para Diamante);\n"
				+ "G: Gênero do cliente (M para Masculino, F para Feminino, N para Não definido, O para Outro).\n");
		
		
		ano= Integer.parseInt(matricula.substring(2,4));
		if(ano <22) {
			JOptionPane.showMessageDialog(null,"Não e desse ano essa matricula");
		}else {
			JOptionPane.showMessageDialog(null,"Matricula: "+ matricula);
		}
		
		
	}

}
