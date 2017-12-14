package Model;

public class Conta {
	protected double saldo;
	
	public void atualizada(double taxa){
		this.saldo +=this.saldo *taxa;
		
	}
	
	
	public void deposita(double valor){
		this.saldo += valor;
		
	}
	public void saca(double valor){
		this.saldo-=valor;
	}
	public double getSaldo(){
		return this.saldo;
	}
	
}
