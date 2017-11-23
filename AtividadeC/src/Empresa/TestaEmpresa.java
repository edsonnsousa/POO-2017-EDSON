package Empresa;

public class TestaEmpresa {
	
	  Empresa ADS = new Empresa("Analise E Desenvolvimento", "23456");
	  
	  
      for (int x = 0; x < 10; i++) {
          Funcionario f = new Funcionario();
          f.salario = 1000 + x * 100;
          f.numero = x+1;
          ADS.adiciona(f);
      };
      JP.mostraEmpregados();
      
      
      for(int x=0 ; i < JP.empregados.length ; i++){
          ADS.empregados[x].mostra();
      }
      
      Funcionario f7 = new Funcionario();
      Funcionario f11 = new Funcionario();
      f7.numero = 7;
      f11.numero = 11;
      System.out.println("\nContém o funcionario 7? : " + ADS.contem(f7));
      System.out.println("Contém o funcionario 11? : " + ADS.contem(f11));
      
      
      Funcionario[] empregados2 = new Funcionario[11];
      
      
      for(int i=0 ; i < JP.empregados.length ; i++){
          empregados2[i] = ADS.empregados[i];
      }
      
      
      empregados2[10] = f11;

      
  
      
      //Mostrando os empregados
      System.out.println("\nUsando o método 'mostra', de cada funcionário:");
      for(int i=0 ; i < empregados2.length ; i++){
          empregados2[i].mostra();
      }
      

      
	  }
	  };





