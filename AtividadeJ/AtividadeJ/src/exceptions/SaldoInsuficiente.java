package exceptions;

public class SaldoInsuficiente extends RuntimeException{
	public SaldoInsuficiente(double valor) {
		super("Voce nao possui R$ " + valor+ " na conta.");
	}

}