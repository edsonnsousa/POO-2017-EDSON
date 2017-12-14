package App;


import Model.Diarista;
import Model.Empregado;
import Model.Horista;

public class TestaFuncionarios {
	public static void main(String[] args) {
		Empregado empregado = new Empregado();
		Diarista diarista = new Diarista();
		Horista horista = new Horista();
		empregado.setSalario(200);
		diarista.setSalario(200);
		horista.setSalario(200);
		
		System.out.println("Empregado: "+ empregado.calcSalario() +"\n"
				+"Diarista: "+ diarista.calcSalario() +"\n"
+"Horista: "+ horista.calcSalario());
	}

}
