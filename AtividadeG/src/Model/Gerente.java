package Model;

public abstract class Gerente extends Funcionario {
	public Gerente(String nome,double salario) {
			super(nome, salario);
	}
	@Override
	public double Bonificacao() {
		return super.Bonificacao()*Financeiro.ParticipacaoLucro()+super.getSalario();
	}
}
