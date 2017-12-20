package Model;

public class Circulo implements AreaCalculavel {
	private double raio;
	public Circulo(double raio) {
		this.raio=raio;
	}
	@Override
	public double calculaArea() {
		return Math.PI *raio*raio;
	}
}
