/**
 * 
 */
package classes_abstratas;

import classes.Agencia;
import classes.Cliente;

/**
 * @author jonascosta
 */
public abstract class Conta {
	private int numero_conta;
	private double saldo;
	private double limite;
	private Agencia agencia;
	private Cliente cliente;
	
	
	
	
	
	public Conta(Agencia agencia, Cliente cliente) {
		this.agencia = agencia;
		this.cliente = cliente;
	}
	public int getNumero_conta() {
		return numero_conta;
	}
	public void setNumero_conta(int numero_conta) {
		this.numero_conta = numero_conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public void consulta_saldo(){
		System.out.println(this.saldo);
	}
	
	public void saque(double valor){
		this.saldo -= valor;
	}
	
	public void extrato_conta(){
		System.out.println("saldo: " + this.saldo);
		System.out.println("limite: " + this.limite);
	}
	
	public void transfere(Conta destino, double valor){
		this.saldo -= valor;
		destino.saldo += valor;
	}
	
	
	
	
	
	
	

}
