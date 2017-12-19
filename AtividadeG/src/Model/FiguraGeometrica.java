package Model;

public abstract class FiguraGeometrica {
	private int lado;
	
	public FiguraGeometrica (int lado) {
		this.lado = lado;
	}
	public int Lado() {
        return lado;
    }

    public abstract int perimetro();

    public abstract int area();

}
