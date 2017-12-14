package App;

import Model.CalculadoraCientifica;

public class Calculadora {
	public static void main(String[] args) {
		CalculadoraCientifica calcu = new CalculadoraCientifica(7, 3);
		System.out.println("Exponenciacao: " + calcu.exponenciar());
		System.out.println("Dividir/Arredondar: "+calcu.dividir(true));
	}
}
