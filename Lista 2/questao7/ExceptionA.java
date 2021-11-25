package questao7;

public class ExceptionA extends Exception{

    public ExceptionA() {
        super("\n ERROR: A = 0 " );
    }
    
    public ExceptionA(String m){
        super(m);
    }

}
