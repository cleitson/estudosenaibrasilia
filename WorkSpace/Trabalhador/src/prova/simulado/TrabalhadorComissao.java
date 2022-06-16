package prova.simulado;

public class TrabalhadorComissao extends Trabalhador implements ICalculo{

	private double comissao,nvenda;
	
	public TrabalhadorComissao() {
	}
	
	public TrabalhadorComissao(String nome, String sobrenome, double salario, double comissao, double nvenda,
			double total) {
		super(nome, sobrenome, salario);
		this.comissao = comissao;
		this.nvenda = nvenda;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getNvenda() {
		return nvenda;
	}

	public void setNvenda(double nvenda) {
		this.nvenda = nvenda;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Trabalhador por comissão: "  + getNome() +" "+ getSobrenome() +", salario: " + calcular();
	}

	@Override
	public double calcular() {
		// TODO Auto-generated method stub
		return (getSalario()+comissao)/nvenda;
	}

}
