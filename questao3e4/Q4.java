package questao3e4;
/*
 * Classe usada para definir a vaga onde será estacionado com base na cor do veiculo 
 * e bonus por tempo no estacionamento
 */
import java.util.Scanner;

public class Q4 {

	public Q4() {
		// TODO Auto-generated constructor stub
	}
	
	public void estacionar() {
		
		String cor;
		Scanner ler = new Scanner(System.in);
	
    	System.out.println("Informe a cor do veiculo: ");
			cor = ler.nextLine();
		
		if(cor.equals("preto")) {
			System.out.println("Estacione em uma vaga de numero impar");
		
		}else if(cor.equals("branco")) {
			System.out.println("Estacione em uma vaga de numero par");
			
		}else if(cor.equals("vermelho")){
			System.out.println("Estacione em uma vaga de numero multiplo de 5");
		
		}else{
			System.out.println("Você não é bem vindo aqui, pague uma taxa extra de R$33");
		}
			
    }	
	
	public void bonus(int diferenca) {
		
		if(diferenca >= 120 && diferenca < 180) {
			System.out.println("Bonus por tempo: Ganhou o direito a uma ducha");
		
		}else if(diferenca >= 180) {
			System.out.println("Bonus por tempo: Ganhou direito a uma ducha e um aromatizante");
			
		}else {
			System.out.println("Não possui direito a bonus");
		}	
	}
	
}
