/**
 * 
 */
package classes;

/**
 * @author jonascosta
 */
public class Carro {
	private String nome;
	private String modelo;
	private int ano;
	private String marca;
	private Roda roda_1;
	private Roda roda_2;
	private Roda roda_3;
	private Roda roda_4;
	
	
	
	public Roda getRoda_1() {
		return roda_1;
	}



	public void setRoda_1(Roda roda_1) {
		this.roda_1 = roda_1;
	}



	public Roda getRoda_2() {
		return roda_2;
	}



	public void setRoda_2(Roda roda_2) {
		this.roda_2 = roda_2;
	}



	public Roda getRoda_3() {
		return roda_3;
	}



	public void setRoda_3(Roda roda_3) {
		this.roda_3 = roda_3;
	}



	public Roda getRoda_4() {
		return roda_4;
	}



	public void setRoda_4(Roda roda_4) {
		this.roda_4 = roda_4;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void acelera(int velocidade) {
		System.out.println(this.getNome() + " esta acelerado a" + velocidade + " Km/h");
	}
	
	public void freia() {
		System.out.println("freiando");
		
	}
	
	public void acende_farol(){
		System.out.println("farol ligado");
	}

	@Override
	public String toString() {
		return nome ;
	}
	
	
	
	
}
