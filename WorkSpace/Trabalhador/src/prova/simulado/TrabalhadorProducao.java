package prova.simulado;

public class TrabalhadorProducao extends Trabalhador implements ICalculo {

	private double vproduzido,qproduto;

	public TrabalhadorProducao() {
		
	};
	
	public TrabalhadorProducao(String nome, String sobrenome, double salario, double vproduzido, double qproduto) {
		super(nome, sobrenome, salario);
		this.vproduzido = vproduzido;
		this.qproduto = qproduto;
	}

	public double getVproduzido() {
		return vproduzido;
	}

	public void setVproduzido(double vproduzido) {
		this.vproduzido = vproduzido;
	}

	public double getQproduto() {
		return qproduto;
	}

	public void setQproduto(double qproduto) {
		this.qproduto = qproduto;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Trabalhador por produção: "  + getNome() +" "+ getSobrenome() +", salario: " + calcular();
	}

	@Override
	public double calcular() {
		// TODO Auto-generated method stub
		return vproduzido*qproduto;
	}

}
