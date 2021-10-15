package questao5e6;

import java.util.Scanner;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		int escolha, gerado, acertou, pontos = 100;
		Descobrir desc = new Descobrir();
		Q6 ponto = new Q6();
		Scanner ler = new Scanner(System.in);
		
		gerado = desc.gerar();
		
		do {
		
    	System.out.println("Informe um numero de 1 até 10: ");
			escolha = ler.nextInt();
			
		acertou = desc.verificar(escolha, gerado);
		
		if(acertou == 0) {
			pontos -=10;
		}
		
		}while(acertou != 1);
		
		ponto.pontuacao(pontos);
		
	}

}
