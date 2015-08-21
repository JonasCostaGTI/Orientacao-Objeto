/**
 * 
 */
package classes_abstratas;

/**
 * @author jonascosta
 */
public abstract class  Pessoa {
	private String nome;
	private int idade;
	private String sobre_nome;
	private double peso;
	private double altura;
	private String cpf;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSobre_nome() {
		return sobre_nome;
	}
	public void setSobre_nome(String sobre_nome) {
		this.sobre_nome = sobre_nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void corre(){
		System.out.println(this.nome + " Correndo");
	}
	
	public void caminha(){
		System.out.println(this.nome + " Caminhando");
	}
	
	public void fala(){
		System.out.println(this.nome + " Falando");
	}
	
	public void come(){
		System.out.println(this.nome + " Comendo");
	}
	
	public void trabalha9(){
		System.out.println(this.nome + " Trabalhando");
	}
	
	@Override
	public String toString() {
		return toString();
	}
	
	
	
	

	
}
