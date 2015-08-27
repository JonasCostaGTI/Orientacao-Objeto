/**
 * 
 */
package classes;

import classes_abstratas.Pessoa;

/**
 * @author jonascosta
 */
public class Funcionario extends Pessoa {
	private int registro;
	private double salario;
	private Carro carro;
	private static double vale_refeicao;

	public static double getVale_refeicao() {
		return vale_refeicao;
	}

	public static void setVale_refeicao(double vale_refeicao) {
		Funcionario.vale_refeicao = vale_refeicao;
	}

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

	void folga() {
		System.out.println(this.getNome() + " Esta de folga");
	}

	public void aumento_salario(double novo_salario) {
		this.salario = novo_salario;
	}

	public void consulta_dados() {
		System.out.println("DADOS DO FUNCIONARIO");
		System.out.println("Nome: " + getNome());
		System.out.println("Registro: " + this.registro);
		System.out.println("Salario: " + this.salario);
		System.out.println("Carro ano: " + this.carro.getAno() + ", Marca: " + this.carro.getMarca());
	}

	public static void reajuste_vale_refeicao(double valor) {
		Funcionario.vale_refeicao += valor;
	}

}
