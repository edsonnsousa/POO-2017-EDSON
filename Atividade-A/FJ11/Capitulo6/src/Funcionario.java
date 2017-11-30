

public class Funcionario {
	private String nome,
				   setor;
	private double salario;
	private final int identificador;
	private static int numFuncionarios;
	
	Funcionario(){
		identificador = ++numFuncionarios;
	}
	
	Funcionario(String nome){
		setNome(nome);
		identificador = ++numFuncionarios;
	}
	
	public int getIdentificador() {
		return identificador;
	}

	public double getGanhoAtual(){
		return 13 * this.salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
