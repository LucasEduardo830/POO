package questao1e2;

import java.lang.Math;

public class Operacoes {

	public Operacoes() {
		// TODO Auto-generated constructor stub
	}

	public void abs(int x){
		
        System.out.println("Numero: " +x);
        System.out.println("M�todo Abs:" +Math.abs(x));
        
    }
    
    public void ceil(int x){
    	
        System.out.println("Numero: " +x);
        System.out.println("M�todo Ceil:" +Math.ceil(x));
    }
    
    public void cos(int x){
    	
    	double y = Math.toRadians(x);
        System.out.println("Numero: " +x);
        System.out.println("M�todo Cos:" +Math.cos(y));
    }
    
    public void exp(int x){
        System.out.println("Numero: " +x);
        System.out.println("M�todo Exp:" +Math.exp(x));
    }
    
    public void floor(int x){
        System.out.println("Numero: " +x);
        System.out.println("M�todo Floor:" +Math.floor(x));
    }
    
    public void log(int x){
        System.out.println("Numero: " +x);
        System.out.println("M�todo Log:" +Math.log(x));
    }
    
    public void max(int x, int y){
        System.out.println("Numeros: " +x+ ", " +y);
        System.out.println("M�todo Max:" +Math.max(x,y));
    }
    
    public void min(int x, int y){
        System.out.println("Numeros: " +x+ ", " +y);
        System.out.println("M�todo Min:" +Math.min(x,y));
    }
    
    public void pow(int x, int y){
        System.out.println("Numeros: " +x+ ", " +y);
        System.out.println("M�todo Pow:" +Math.pow(x,y));
    }
    
    public void sqrt(int x){
        System.out.println("Numero: " +x);
        System.out.println("M�todo Sqrt:" +Math.sqrt(x));
    }
}
