package lista2.logica8;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crie um algoritmo que leia uma sigla UF do Brasil e mostre a capital correspondente. 
		
		String uf;
		
		uf=JOptionPane.showInputDialog("Digite uma sigla UF do Brasil para saber a capital correspondente").toUpperCase();
		
		switch(uf){
			case ("AC"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado: Acre \n Capital: Rio Branco");break;
			case ("AL"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Alagoas \n Capital:Maceió ");break;
			case ("AP"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Amapá \n Capital: Macapá");break;
			case ("AM"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Manaus \n Capital: Amazonas");break;
			case ("BA"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Bahia \n Capital: Salvador");break;
			case ("CE"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Ceará \n Capital: Fortaleza");break;
			case ("DF"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Distrito Federal \n Capital: Brasília");break;
			case ("ES"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Espírito Santo \n Capital: Vitória	");break;
			case ("GO"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Goiás \n Capital: Goiânia");break;
			case ("MA"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Maranhão \n Capital: São Luís");break;
			case ("MT"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Mato Grosso \n Capital: Cuiabá");break;
			case ("MS"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Mato Grosso do Sul \n Capital: Campo Grande");break;
			case ("MG"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Minas Gerais \n Capital: Belo Horizonte");break;
			case ("PA"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Pará \n Capital: Belém");break;
			case ("PB"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Paraíba \n Capital: João Pessoa");break;
			case ("PR"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Paraná \n Capital: Curitiba");break;
			case ("PE"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Pernambuco \n Capital: Recife");break;
			case ("PI"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Piauí \n Capital: Teresina");break;
			case ("RJ"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Rio de Janeiro \n Capital: Rio de Janeiro");break;
			case ("RN"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Rio Grande do Norte \n Capital: Natal");break;
			case ("RS"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Rio Grande do Sul \n Capital: Porto Alegre");break;
			case ("RO"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Rondônia \n Capital: Porto Velho");break;
			case ("RR"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Roraima \n Capital: Boa Vista");break;
			case ("SC"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Santa Catarina \n Capital: Florianópolis");break;
			case ("SP"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado São Paulo \n Capital: São Paulo");break;
			case ("SE"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Sergipe \n Capital: Aracaju");break;
			case ("TO"):JOptionPane.showMessageDialog(null, "Digitado: "+uf + "\n Estado Tocantins \n Capital: Palmas");break;
			default:JOptionPane.showMessageDialog(null, "UF Invalido");;
		}
		
	}

}
