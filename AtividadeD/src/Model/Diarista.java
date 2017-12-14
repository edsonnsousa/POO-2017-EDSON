package Model;

public class Diarista extends Empregado {
	public double calcSalario() {
		return(super.calcSalario()/30);
		
	}
}
