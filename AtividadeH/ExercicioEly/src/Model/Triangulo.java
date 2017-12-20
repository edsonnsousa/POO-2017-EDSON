package Model;

public class Triangulo implements FigurasGeometricas, Comparavel{
	private double lado1;
	private double lado2;
	private double lado3;
	private double altura;
	
	
	public double calcularArea(){
		return (lado3*altura)/2;
	}
	
	public double calcularPerimetro(){
		return lado1+lado2+lado3;
	}
		
	
	public double getLado1() {
		return lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public double getLado3() {
		return lado3;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
	public double getAltura() {
		return altura;
	}
	
	
	public void setAltura(double altura) {
		this.altura = altura;
}
	@Override
	public int Comparar(FigurasGeometricas figura) {
		if (this.calcularArea()>figura.calcularArea()){
			return 1;
		}else if(this.calcularArea()<figura.calcularArea()){
			return -1;
		}
		return 0;
}
}