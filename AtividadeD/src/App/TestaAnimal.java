package App;

import Model.Animal;
import Model.Bovino;
import Model.Peixe;

public class TestaAnimal {
	public static void main(String[] args) {
		Animal animal1= new Animal();
		Animal animal2= new Bovino();
		Animal animal3= new Peixe();
		animal1.setEspecie("Felino");
		((Bovino)animal2).setProducaoLeite(20);
		((Peixe)animal3).setProfundidade(7);
		
		
		Animal[] animais= new Animal[6];
		animais[0] = animal1;
		animais[1] = animal2;
		animais[2] = animal3;
		animais[3] = new Animal();
		animais[4] = new Bovino();
		animais[5] = new Peixe();
		
		for (int i = 0; i < 6; i++) {
			System.out.println("\nElemento"+i +":");
			if (animais[i] instanceof Animal) {
				System.out.println("Animal");
			}
			if (animais[i] instanceof Bovino) {
				System.out.println("Bovino");
			}
			if (animais[i] instanceof Peixe) {
				System.out.println("Peixe");
}
		
	}
	}
	}
