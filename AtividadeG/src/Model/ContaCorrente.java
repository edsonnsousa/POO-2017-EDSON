package Model;

public class ContaCorrente extends Conta {
	public ContaCorrente(double saldo,int numero) {
		super(saldo,numero);
	}

	@Override
	public void saca(double valor) {
		super.setSaldo(super.getSaldo()-valor);
		
	}
}
