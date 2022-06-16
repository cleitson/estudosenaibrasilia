package prova.simulado;

public class TrabalhadorChefe extends Trabalhador implements ICalculo {

	private double semanal;

		public TrabalhadorChefe() {
			
		}
		public TrabalhadorChefe(String nome, String sobrenome, double salario, double semanal) {
		super(nome, sobrenome, salario);
		this.semanal = semanal;
	}
		
		public double getSemanal() {
			return semanal;
		}
		public void setSemanal(double semanal) {
			this.semanal = semanal;
		}
		@Override
		public double calcular() {
			return semanal*4;
		}
		
		@Override
		public String toString() {
			return "Trabalhador Chefe: "  + getNome() +" "+ getSobrenome() +", salario: " + calcular();
		}
		
}
