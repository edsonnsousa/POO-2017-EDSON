package Model;


public class Diretor extends Funcionario{

	public Diretor(String nome, double salario) {
		super(nome, salario);
		
	}
	@Override
	public double Bonificacao() {
		return 0;
	}
	
}
