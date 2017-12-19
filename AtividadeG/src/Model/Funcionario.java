package Model;

public abstract class Funcionario {
	private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public abstract double getBonificacao();

	public double Bonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

}

