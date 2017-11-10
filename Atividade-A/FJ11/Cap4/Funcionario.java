package AtividadeC;
public class Funcionario {
	
	
	
	public String nome;
	public double salario;
	public String rg;
	public String funcao;
	public Data Admissao;
	public boolean Empresa;
	
	
	public void recebeAumento(double qtd){
		this.salario += qtd;
	}	
	public double anual(){
		return salario*12;
	
	}
			
	public void mostra() {

		System.out.println("Nome: " + nome + "\nRG: " + rg +"\nFuncao: "+funcao+ "\nSalario: R$ " + salario );
		  
		    // imprimir aqui os outros atributos...
		    /*
		    System.out.println("Dia: " + this.Admissao.dia);
		    System.out.println("Mês: " + this.Admissao.mes);
		    System.out.println("Ano: " + this.Admissao.ano);
		  */
		    System.out.println("Admissao: " + this.Admissao.dia+"/"+this.Admissao.mes+"/"+this.Admissao.ano);

		//System.out.println("Data de Admissao:\nDia: " + this.Admissao.dia + "\nMes: " + this.Admissao.mes +"\nAno: " + this.Admissao.ano);
	}
	public void demite(){
		
		this.Empresa = false;
	}
}