package Model;

public class AtualizadorDeConta {

	private double saldoTotal =0;
	private double selic;
	
	public AtualizadorDeConta(double selic){
		this.selic = selic;
	}
	public void roda(Conta c){
		System.out.println("________");
		System.out.println(c.getSaldo());
		c.atualizada(this.selic);
		System.out.println("Atualizado");
		System.out.println(c.getSaldo());
		this.saldoTotal += c.getSaldo();
		
	}
	public double getSaldoTotal() {
		return saldoTotal;
	}
}
