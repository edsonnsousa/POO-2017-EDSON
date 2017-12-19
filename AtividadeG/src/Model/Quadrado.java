package Model;

import Model.FiguraGeometrica;

public class Quadrado extends FiguraGeometrica {
	
	public Quadrado(int lado) {
		super(lado);
	}
	
	@Override
    public int area() {
        return Lado() * 2;
	}
	@Override
	public int perimetro() {
		return Lado()*4;
	}

}
