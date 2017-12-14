package Model;

public class CalculadoraCientifica extends Calculadora {
	public public CalculadoraCientifica(int operador1,int operador2) {
		// TODO Auto-generated constructor stub
		super(operador1,operador2);
	}
	public double exponenciar() {
			double result = this.operador1;
			for(int i=0; i< this.operador2 -1; i++) {
				result *=this.operador1
				
			}
			return result;
	}
	public double dividir(boolean arrendondar) {
		return super.dividir()+ this.operador1%this.operador2;
	}
}
