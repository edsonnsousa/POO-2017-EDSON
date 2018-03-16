package app;

import exceptions.SaldoInsuficienteException;
import model.Conta;

public class TestaConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.depositar(600);
		conta.sacar(900);
	}

}