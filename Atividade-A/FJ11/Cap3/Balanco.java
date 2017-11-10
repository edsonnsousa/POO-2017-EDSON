package FJ11;

public class Balanco {
	public static void main(String[] args) {
	

		int Janeiro = 15000;
		int Fevereiro = 23000;
		int Marco = 17000;
		int Trimestre = Janeiro+Fevereiro+Marco;
		System.out.println("Valor trimestral = "+Trimestre);
		int media = Trimestre / 3;
		System.out.println("Valor mensal = "+media);
	}


}
