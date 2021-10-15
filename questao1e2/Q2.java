package questao1e2;

/*
 *Classe que contem as 4 operações basicas, soma, subtração, divisão e multiplicação 
*/


public class Q2 {

	public Q2() {
		// TODO Auto-generated constructor stub
	}

    public void soma(int x, int y){
        System.out.println("Numeros: " +x+ ", " +y);
        System.out.println("Soma: " +(x + y));
    }
    
    public void sub(int x, int y){
        System.out.println("Numeros: " +x+ ", " +y);
        System.out.println("Subtração: " +(x - y));
    }
    
    public void div(int x, int y){
        System.out.println("Numeros: " +x+ ", " +y);
        System.out.println("Divisão:" +(x / y));
    }
    
    public void mult(int x, int y){
        System.out.println("Numeros: " +x+ ", " +y);
        System.out.println("Multiplicação:" +(x * y));
    }


}
