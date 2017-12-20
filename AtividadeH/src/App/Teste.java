package App;

import Model.AreaCalculavel;
import Model.Retangulo;

public class Teste {
	public static void main(String[] args) {
		AreaCalculavel a =new Retangulo(3, 2);
		System.out.println(a.calculaArea());
	}
}
