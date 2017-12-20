package Model;
public class Retangulo implements FigurasGeometricas{
	private double lado1;
	private double lado2;
	
	public double calcularArea(){
		return lado1*lado2;
	}
	
	public double calcularPerimetro(){
		return lado1*2 + lado2*2;
	}

	public double getLado1() {
		return lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
}
	public int Comparar(FigurasGeometricas figura) {
		if (this.calcularArea()>figura.calcularArea()){
			return 1;
		}else if(this.calcularArea()<figura.calcularArea()){
			return -1;
		}
		return 0;
}}