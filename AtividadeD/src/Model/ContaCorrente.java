package Model;

public class ContaCorrente extends Conta {
	public void atualizada(double taxa){
		super.atualizada(taxa *2) ;
	}
	
	public void deposita (double valor){
		this.saldo += valor -0.10;
	}

}
