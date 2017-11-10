package AtividadeC;

public class Fibonacci {
	
	int num1 = 0;
	int num2 = 1;
	
	public int calcular(int valor){
		
		num2 += num1;
		
		if (valor <= 0){
			
			return num1;
		}
		
		if (valor == 2 || valor == 1){
			
			return num2;
		}
		else {
			num1 = num2 - num1;
			valor--;
			
			
						
			return calcular(valor);
			
		}
		
		
		
		 
	}
	public int Ternario(int valor) {
		return (valor <= 2) ? num2 : Ternario(valor - 1);
	}
	

}
