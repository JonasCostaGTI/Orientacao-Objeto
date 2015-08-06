/**
 * 
 */
package classes;

/**
 * @author jonascosta
 */
public class Funcionario extends Pessoa {
	private int registro;
	private double salario;
	private Carro carro;
	
	
	
	
	
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void folga(){
		System.out.println(this.getNome() + " Esta de folga");
	}
	
	
}
