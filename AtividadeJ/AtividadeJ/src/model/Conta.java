package model;

import exceptions.SaldoInsuficiente;

public class Conta {
	
	public Conta(){
		
	}
	
	protected double saldo;
	

	
	public void depositar(double valor) {
		if (valor <= 0){
			throw new IllegalArgumentException("Você tentou depositar" + 
                    "valor negativo");
			
		}else{
			this.saldo += valor;
			
		}
		
	}