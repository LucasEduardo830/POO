package questao5e6;

import java.util.Random;

public class Descobrir {

	public Descobrir() {
		// TODO Auto-generated constructor stub
	}
	
	public int gerar() {
	
		Random random = new Random();
		
		int numero = random.nextInt(10);
		
		return numero;
	}
	
	public int verificar(int escolha, int numero) {
		
		int acertou = 0;
		
		if(escolha == numero) {
			acertou = 1;
			System.out.println("Acertou");
		
		}else if(escolha > numero) {
			System.out.println("Numero escolhido pelo usuario é maior que o numero sorteado");
		
		}else if(escolha < numero) {
			System.out.println("Numero escolhido pelo usuario é menor que o numero sorteado");
		}
		
		return acertou;
	}
	

}
