package Model;

public abstract class Conta {
	private double saldo;
	private int numero;
	
	public Conta(double saldo,int numero) {
		this.saldo = saldo;
		this.numero =  numero;
		
	}
	   public  void deposita(double valor) {
	        this.saldo += valor;
	}
	
	   public void setSaldo(double saldo) {
	        this.saldo = saldo;
	}
	  
	   public double getSaldo() {
	        return this.saldo;
	}
	   public abstract void saca(double valor);

	   public void atualiza(double taxa) {
	        this.saldo += this.saldo * taxa;
	}

	
}
