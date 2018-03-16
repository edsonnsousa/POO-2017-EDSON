package model;

import exceptions.SaldoInsuficiente;

public class Conta implements Comparable<Conta>{
	
	protected double saldo;
	private String titular;
	
	public Conta(String titular){
		this.titular = titular;
	}
	
	public void atualizar(double taxa){
		this.saldo += this.saldo * taxa;
	}
	
	public void depositar(double valor) {
		if (valor <= 0){
			throw new IllegalArgumentException("Você tentou depositar" + 
                    " um valor negativo");
			
		}else{
			this.saldo += valor;
			
		}
	}
	
	public String getTitular(){
		return this.titular;
	}
	
	public void sacar(double valor) throws SaldoInsuficiente{
		if (valor <= 0){
			throw new IllegalArgumentException("Você tentou sacar um valor negativo");
		
		}
		if(valor> this.saldo){
			throw new SaldoInsuficiente(valor);
			
		}
		
		this.saldo -= valor;
		
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	

	public int compareTo(Conta outraConta) {
		
		return this.titular.compareTo(outraConta.titular);
        }

}