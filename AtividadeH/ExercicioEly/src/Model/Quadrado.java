package Model;

import javax.annotation.processing.SupportedSourceVersion;

public class Quadrado implements FigurasGeometricas, Comparavel{
	private double lado;
	
	public double calcularArea() {
		return getLado()*getLado();
	}

	private double getLado() {
		// TODO Auto-generated method stub
		return lado;
	}

	@Override
	public double calcularPerimetro() {
		
		return getLado() *4;
	}
	public void setLado(double lado){
		this.lado = lado;
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
