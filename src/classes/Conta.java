/**
 * 
 */
package classes;

/**
 * @author jonascosta
 */
public abstract class Conta {
	private int numero_conta;
	private double saldo;
	private double limite;
	private Agencia agencia;
	private Cliente cliente;
	
	
	
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
	
	void deposita(double valor){
		this.saldo += valor;
	}
	
	double consulta_saldo(){
		return this.saldo;
	}
	
	void saque(double valor){
		this.saldo -= valor;
	}
	
	void extrato_conta(){
		System.out.println("saldo: " + this.saldo);
		System.out.println("limite: " + this.limite);
	}
	
	
	
	
	
	
	

}
