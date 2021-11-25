package questao7;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner( System.in );
        String palavra = null, newpalavra;
        BufferedReader arq = null;
		float x, y, result = 0;		
		
        System.out.println("\n Digite o Valor de X:" );
        	x = leitura.nextFloat();

        System.out.println("\n Digite o Valor de Y:");
        	y = leitura.nextFloat();
        
        	
        try {
        	
        	newpalavra = palavra.toUpperCase();
            System.out.println("\n New palavra: " + newpalavra);
        } catch (NullPointerException pe) {
            System.out.println(pe.getMessage());
        	
        	try {
             	
        		arq = new BufferedReader(new FileReader("/tmp/arquivoInexistente"));       
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
	            try {
	            	
	            	if(x == 0) {
	            		throw new ExceptionA();
	            	
	            	} else if(y == 0) {
	            		throw new ExceptionB();
	            	
	            	}else {
	            		result =  (1 / x)*(1 / y);
	                    System.out.println("\n Resultado: " + result );
	            	}
	            	
	            } catch (ExceptionB e) {
	
	                System.out.println(e.getMessage());
	            } catch (ExceptionA e) {
	
	                System.out.println(e.getMessage());
	            } 
            }

        } 
    
	}

}
