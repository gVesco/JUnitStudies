package br.com.junitstudies;

public class Conta {
	
	private String numeroConta;
	private double saldo;
	
	public Conta(String numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public void lancaCredito(int valor) {
		this.saldo += valor;
	}
	
	public void lancaDebito(int valor) {
		this.saldo -= valor;
	}
	
	
}
