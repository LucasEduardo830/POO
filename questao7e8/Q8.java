package questao7e8;

import java.time.Duration;

public class Q8 {
	
	private int hrs;
	private int min;
	private int seg;
	
	public Q8() {
		// TODO Auto-generated constructor stub
	}
	
	public void duracao(int tempo) {
		
		Duration total = Duration.ofSeconds(tempo);
		this.hrs = total.toHoursPart();
		this.min = total.toMinutesPart();
		this.seg = total.toSecondsPart();
		System.out.println("Dura��o das oscila��es: " +this.hrs+ "hr " +this.min+ "min "+this.seg+ "s");
	}
}
