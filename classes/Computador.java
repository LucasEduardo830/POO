package classes;

public class Computador extends Data{
	private String nome;
	private String marca;
	
	public Computador() {
		
	}
	
	public String toString() {
		return "nome: " + this.nome + "\nMarca: " +
this.marca + "\nData: " + this.dia +"/" +
this.mes + "/" + this.ano; 
	}
	
	public Computador setNome(String n) {
		this.nome = n;
		return this;
	}
	
	public Computador setMarca(String m) {
		this.marca = m;
		return this;
	}
	

}
