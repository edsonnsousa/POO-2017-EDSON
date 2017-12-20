package Model;

public class ContaCorrente extends Conta implements Tributavel {
	public ContaCorrente(double saldo,int numero) {
		super(saldo,numero);
	}

	@Override
	public void saca(double valor) {
		super.setSaldo(super.getSaldo()-valor);
		
	}

	@Override
	public double calcularTributos() {
		
		return this.getSaldo() * 0.01;
	}
}
