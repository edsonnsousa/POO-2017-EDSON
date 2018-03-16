package app;

import model.*;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class ManipularContas {
	
	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente("Jose");
		cc1.depositar(500);
		
		ContaCorrente cc2 = new ContaCorrente("Jorge");
		cc2.depositar(600);
		
		ContaCorrente cc3 = new ContaCorrente("Maria");
		cc3.depositar(400);
		
		ContaCorrente cc4 = new ContaCorrente("Joao");
		cc4.depositar(200);
		
		List<ContaCorrente> contas = new ArrayList();
		contas.add(cc1);
		contas.add(cc2);
		contas.add(cc3);
		contas.add(cc4);
		contas.add(cc5);
		
		for(Conta c : contas){
			System.out.println("Conta do dono: " + c.getTitular());
		}
		
		Collections.sort(contas);
		Collections.rotate(contas,1);
		
		
	
		
		for(Conta c : contas){
			System.out.println("Conta do(a) dono(a): " + c.getTitular());
		}
		
	}

}