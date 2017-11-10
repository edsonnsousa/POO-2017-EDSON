package AtividadeC;

public class TesteFuncio {

	public static void main(String[] args) {
		
		
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
				
		func1.nome = "Maria";
		func1.rg="43952-2";
		func1.salario = 2000.00;
		func1.Admissao.dia=10;
		func1.Admissao.mes=02;
		func1.Admissao.ano=2017;
		func1.funcao="Vendedor";
		
		func2.nome = "Maria";
		func2.salario = 2000.00;
		
		if (func1 == func2){
			
			System.out.println("Iguais ");
		} else {
			
			System.out.println("Diferentes!");
		}
		
		
		func2 = func1;
		//Quando funcionario 2 eh atribuido ao funcionario 1,passam a ser iguais
		
		if (func1 == func2){
			
			System.out.println("Iguais!");
		} else {
			
			System.out.println("Diferentes!");
		}
		
		Data data = new Data();
		func1.Admissao=data;
		
		func1.mostra();
		
		
		

	}

}