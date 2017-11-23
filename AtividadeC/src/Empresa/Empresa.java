package Empresa;

public class Empresa {
    Funcionario[] empregados;
    String nome,cnpj;
    int numFuncionarios;
    
    Empresa(String nome, String cnpj){
        empregados = new Funcionario[10];
        numFuncionarios=0;
        this.nome = nome;
        this.cnpj = cnpj;
    }
    
    void adiciona(Funcionario f){
        if(numFuncionarios < 10){
            empregados[numFuncionarios] = f;
            numFuncionarios++;
        }
    }
    
    void mostraEmpregados(){
        System.out.println("Empresa " + this.nome + " CNPJ " + this.cnpj);
        for(int count=0 ; count < numFuncionarios ; count++){
            System.out.println("Empregado de número " + (count + 1) + ": " + empregados[count].getSalario());
        }
    }
    
    boolean contem(Funcionario f){
        for(Funcionario funcionario: empregados){
            if(funcionario.numero == f.numero){
                return true;
            }
        }
        return false;
    }

}