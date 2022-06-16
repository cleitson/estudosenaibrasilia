package prova.simulado;

public class TrabalhadorHorista extends Trabalhador implements ICalculo {

	
	private double vhora,qhora;
	
	public TrabalhadorHorista() {
		
	};
	
	public TrabalhadorHorista(String nome, String sobrenome, double salario, double vhora, double qhora) {
		super(nome, sobrenome, salario);
		this.vhora = vhora;
		this.qhora = qhora;
	}

	public double getVhora() {
		return vhora;
	}

	public void setVhora(double vhora) {
		this.vhora = vhora;
	}

	public double getQhora() {
		return qhora;
	}

	public void setQhora(double qhora) {
		this.qhora = qhora;
	}

	@Override
	public double calcular() {
		// TODO Auto-generated method stub
		return vhora*qhora;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Trabalhador horista: "  + getNome() +" "+ getSobrenome() +", salario: " + calcular();
	}

}
