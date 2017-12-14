package App;
import Model.*;
public class TestaContas {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
//		Conta c = new Conta();
//		Conta cc = new ContaCorrente();
//		Conta cp = new ContaPoupança();
//		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		c.atualizada(0.01);
		cc.atualizada(0.01);
		cp.atualizada(0.01);
		
		AtualizadorDeConta adc = new AtualizadorDeConta(0.01);
		
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
		
		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
	}

}
