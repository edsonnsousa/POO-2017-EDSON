package App;
import Model.*;
public class TestaFiguras {
	public static void main(String[] args) {

			
			Quadrado quadrado = new Quadrado();
			Triangulo triangulo = new Triangulo();
			Retangulo retangulo = new Retangulo();
			
			quadrado.setLado(5);
			
			retangulo.setLado1(5);
			retangulo.setLado2(5);
			
			triangulo.setAltura(4);
			triangulo.setLado1(5);
			triangulo.setLado2(4);
			triangulo.setLado3(3);
			
			System.out.println(quadrado.Comparar(retangulo));
			System.out.println(retangulo.Comparar(triangulo));
			System.out.println(triangulo.Comparar(quadrado));
		}


	}

