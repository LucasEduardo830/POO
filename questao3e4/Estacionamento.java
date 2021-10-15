package questao3e4;

import java.util.Scanner;

public class Estacionamento {

	public Estacionamento() {
		// TODO Auto-generated constructor stub
	}	
	
	public static void main(String[] args) {

		String tipo, placa;
		int entrada, saida, diferenca, entradaHR, entradaMIN, saidaHR, saidaMIN;
		
		Pagamento carro = new Pagamento();
		Q4 estaciona = new Q4();
		
        Scanner ler = new Scanner(System.in);
        
    	System.out.println("Informe o tipo de veiculo: ");
    		tipo = ler.nextLine();
        System.out.println("Informe a placa do veiculo: ");
        	placa = ler.nextLine();
        System.out.println("Hora de entrada: ");
        	entradaHR = ler.nextInt();
        System.out.println("Minuto de entrada: ");
    		entradaMIN = ler.nextInt();
        System.out.println("Hora de saida: ");        
    		saidaHR = ler.nextInt();
        System.out.println("Minuto de saida: ");        
        	saidaMIN = ler.nextInt();
        		
        entrada = (entradaHR * 60) + entradaMIN;
        saida = (saidaHR * 60) + saidaMIN;
        diferenca = saida - entrada;
        
        carro.periodo(tipo, placa, diferenca);
        estaciona.estacionar();        
        estaciona.bonus(diferenca);
    }
}
