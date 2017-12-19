package Model;

public class Triangulo extends FiguraGeometrica {
	private double l1;
	private double l2;
	private double l3;
	
	public Triangulo(double l1,double l3,double l3) {
		
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return l1+l2+l3;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
}
