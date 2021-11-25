package questao5;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Soma soma = new Soma();
		Sub sub = new Sub();
		Div div = new Div();
		Mult mult = new Mult();
		
			soma.setOperando1(3f);
			soma.setOperando2(9f);
			System.out.println(soma.getNome());
			System.out.println(soma.getResultado());
			System.out.println("Quantidade de instancias da soma: " + soma.getQuantidade() + "\n");
		
			sub.setOperando1(9.3f);
			sub.setOperando2(9f);
			System.out.println(sub.getNome());
			System.out.println(sub.getResultado());
			System.out.println("Quantidade de instancias da subtração: " + sub.getQuantidade() + "\n");
			
			div.setOperando1(5.7f);
			div.setOperando2(5.7f);
			System.out.println(div.getNome());
			System.out.println(div.getResultado());
			System.out.println("Quantidade de instancias da divisão: " + div.getQuantidade() + "\n");
		
			mult.setOperando1(2.3f);
			mult.setOperando2(2f);
			System.out.println(mult.getNome());
			System.out.println(mult.getResultado());
			System.out.println("Quantidade de instancias da mulplicação: " + mult.getQuantidade() + "\n");

	}

}
