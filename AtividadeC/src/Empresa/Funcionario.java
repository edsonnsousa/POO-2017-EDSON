package Empresa;

public class Funcionario {
	 double salario;
	    int numero;
	    
	    double getSalario(){
	        return this.salario;
	    }
	    
	    void mostra(){
	        System.out.println("Empregado de número " + numero + ": " + getSalario());
	    }
}
