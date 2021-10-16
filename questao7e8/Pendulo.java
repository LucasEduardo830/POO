package questao7e8;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Pendulo {
	
	private int A;
	private int B;
	private int C;
	private int cont;
	
	public Pendulo(int w, int x, int y, int z) {
		this.A = w;
		this.B = x;
		this.C = y;
		this.cont = z;
	}

	public void oscilacao() {
		
		Q8 tempo = new Q8();
	    final JDialog dialog = new JDialog();
		
	    do {
			this.C += 1;
			this.cont += 1;
			
	        if(this.C >= 30) {
	        	this.B += 1;
	            this.C = 0;
	        }
	        
	        if(this.B >= 30) {
	            this.A += 1;
	            this.B = 0;
	        }		

	        JOptionPane janela = new JOptionPane("                        A:" 
	        					+this.A+ "    B:" +this.B+ "    C:" +this.C 
	        					, JOptionPane.PLAIN_MESSAGE, JOptionPane.DEFAULT_OPTION ,
	        					null, new Object[]{}, null);

	        dialog.setTitle("Oscilações do pendulo:"); 
	        dialog.setContentPane(janela);
	        dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
	        dialog.pack();      
	        dialog.setLocation(600, 400);
	        dialog.setVisible(true);
	
	        try { 
	              Thread.sleep(50);
	             	        
	        } catch (InterruptedException ex) {
	                 System.out.println("Falha");
	        }
	
		 	tempo.duracao(cont);
			 	
		}while (this.A < 30);
	    
	}
}