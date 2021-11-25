package questao5;

public class Sub implements IOperacoes{

	private float operation1;
	private float operation2;
	static int instancias = 0;
	
	public Sub() {
		Sub.instancias++;
	}
	
	@Override
	public void setOperando1(float op1) {
		this.operation1 = op1;	
	}
	
	@Override
	public void setOperando2(float op2) {
		this.operation2 = op2;	
	}

	@Override
	public float getResultado() {
		
		float result = this.operation1 - this.operation2;
		
		return (result);
	}

	@Override
	public String getNome() {
		return "Subtração";
	}

	@Override
	public int getQuantidade() {
		return Sub.instancias;
	}
	
}
