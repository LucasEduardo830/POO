package classes;

public class Principal {

	public Principal() {
	}

	public static void main(String[] args) {
		Computador c = new Computador();
		c.setNome("comp1").setMarca("AMD")
		.setData(1,1,2001); 
		System.out.println(c);
	}

}
