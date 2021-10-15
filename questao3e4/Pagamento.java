package questao3e4;

import java.util.Scanner;

public class Pagamento {

	public Pagamento() {
		// TODO Auto-generated constructor stub
	}
	
	public void periodo(String tipo, String placa, int diferenca) {
		
		if(diferenca < 30) {
			System.out.println("Valor do estacionamento: Gratuito");
		
		}else if(diferenca >= 30 && diferenca <= 60) {
			System.out.println("Valor do estacionamento: R$10");
			
		}else {
			System.out.println("Valor do estacionamento: R$20");
		}	
	}
}
