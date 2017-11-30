public class Capitulo6 {

    public static void main(String[] args){
      Funcionario designer = new Funcionario();
      
      //programador.nome = "Edson";
      
      
      System.out.println("Questões 2 e 3 ->");
      designer.setSalario(2000);
      designer.setNome("Alonso");
      designer.setSetor("TI - Programador Java");
      
      System.out.println("Nome do funcionário: " + designer.getNome() +
    		  			 "\nSetor de trabalho: " + designer.getSetor() + 
    		  			 "\nSalário: " + designer.getSalario() + 
      					 "\nGanho anual: " + designer.getGanhoAtual() +
      					 "\nID: " + designer.getIdentificador());
      
      
      
      Funcionario analista = new Funcionario("Bruce Dickinson");
      analista.setSetor("Gestão de projetos");
      analista.setSalario(3000);
      System.out.println("Nome do analista: " + analista.getNome() + 
    		  			 "\nID: " + analista.getIdentificador());
      
     
      System.out.println("\n\nNa nova empresa");
      Empresa JP = new Empresa(3);
      JP.setNome("Empresa Java Progressivo");
      JP.adiciona(designer);
      JP.adiciona(analista);
      JP.adiciona(new Funcionario("Estagiário"));
      JP.getFuncionario(2).setSetor("Faz tudo");
      JP.getFuncionario(2).setSalario(0);
      
      System.out.println(JP.getNome());
      for(int i=0 ; i < 3 ; i++){
    	  System.out.println("Nome: : " + JP.getFuncionario(i).getNome() +
    			  			 "\nSetor: " + JP.getFuncionario(i).getSetor() + 
    			  			 "\nSalário: " + JP.getFuncionario(i).getSalario() + 
    			  			 "\nGanho anual: " + JP.getFuncionario(i).getGanhoAtual() +
    			  			 "\nID: " + JP.getFuncionario(i).getIdentificador() + 
					 		 "\n-----------------------");
      }
      
      
    }
    
}