package questao5e6;

public class Q6 {

	public Q6() {
		// TODO Auto-generated constructor stub
	}

	public void pontuacao(int pontos) {
		
		if(pontos == 100) {
			System.out.println("Pontua��o perfeita: "+pontos);
			
		}else if(pontos >= 80 && pontos < 100) {
			System.out.println("Pontua��o �tima: "+pontos);
			
		}else if(pontos >= 50 && pontos < 80) {
			System.out.println("Pontua��o m�dia: "+pontos);
			
		}else {
			System.out.println("Pontua��o baixa: "+pontos);
		}
		

	}

}
