package questao1e2;

/*
 *Classe que contem as 4 opera��es basicas, soma, subtra��o, divis�o e multiplica��o 
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
        System.out.println("Subtra��o: " +(x - y));
    }
    
    public void div(int x, int y){
        System.out.println("Numeros: " +x+ ", " +y);
        System.out.println("Divis�o:" +(x / y));
    }
    
    public void mult(int x, int y){
        System.out.println("Numeros: " +x+ ", " +y);
        System.out.println("Multiplica��o:" +(x * y));
    }


}
