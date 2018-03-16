package app;

import model.Conta;

public class TesteReferenciaNula {

	public static void main(String[] args) {
		Conta c = null;
		System.out.println("Saldo" + c.getSaldo());

	}

}