package questao1e2;
import java.util.Scanner;

public class Menu {
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}
	
	public static void opcoes() {
        System.out.println("Escolha uma das opções: ");
        System.out.println("0-Encerra o programa");
        System.out.println("1-Abs");
        System.out.println("2-Ceil");
        System.out.println("3-Cos");
        System.out.println("4-Exp");
        System.out.println("5-Floor");
        System.out.println("6-Log");
        System.out.println("7-Max");
        System.out.println("8-Min");
        System.out.println("9-Pow");
        System.out.println("10-Sqrt");
        System.out.println("-------------------");
        System.out.println("11-Soma");
        System.out.println("12-Subtração");
        System.out.println("13-Divisão");
        System.out.println("14-Multiplicação");
	}
	
	public static void main(String[] args) {
        int opcao, x, y;
        Scanner entrada = new Scanner(System.in);
        Operacoes op = new Operacoes();
        Q2 basic = new Q2();
        
        do{        
            System.out.println("Digite um primeiro numero: ");
            	x = entrada.nextInt();
            System.out.println("Digite um segundo numero: ");
            	y = entrada.nextInt();
            
            opcoes();
            
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 0:
            	System.out.println("Programa finalizado");
                break;
                
            case 1:
                op.abs(x);
                break;
                
            case 2:
                op.ceil(x);
                break;
                
            case 3:
                op.cos(x);
                break;
                
            case 4:
                op.exp(x);
                break;
                
            case 5:
                op.floor(x);
                break;
                
            case 6:
                op.log(x);
                break;
                
            case 7:
                op.max(x, y);
                break;
                
            case 8:
                op.min(x, y);
                break;
                
            case 9:
                op.pow(x, y);
                break;
                
            case 10:
                op.sqrt(x);
                break;
                
            case 11:
                basic.soma(x, y);
                break;
                
            case 12:
                basic.sub(x, y);
                break;
                
            case 13:
                basic.div(x, y);
                break;
                
            case 14:
                basic.mult(x, y);
                break;
                
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
        
    }

}
