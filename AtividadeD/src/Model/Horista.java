package Model;

public class Horista extends Diarista {

public double calcSalario() {
		return super.calcSalario()/24.0;
}
}