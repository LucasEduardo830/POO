package questao9;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Iterator;


public class Principal  extends JFrame {

    private JRadioButton m1, m2, m3, sim, sair;
    private JLabel pergunta, pergunta2;
    private ButtonGroup opcao1, opcao2;
    private RadioButtonAltera altera;
    
    public Principal() {
    	
         setLayout(null);
         altera = new RadioButtonAltera();
         
         pergunta = new JLabel("Escolha a matéria que você deseja cancelar:");
         	add(pergunta);
      		pergunta.setBounds(20,50,260,40);  
         pergunta2 = new JLabel("\n Você realmente tem certeza disso?");
         	add(pergunta2);
   			pergunta2.setBounds(40,220,220,20);
         
         opcao1 = new ButtonGroup(); 
         opcao2 = new ButtonGroup();
         
         m1 = new JRadioButton(" POO", false);
	        opcao1.add(m1);
	      	m1.setBounds(100,90,100,40);
	      	
         m2 = new JRadioButton(" ED2", false);
	         opcao1.add(m2);
	      	 m2.setBounds(100,130,100,40);
	      	 
         m3 = new JRadioButton(" CALC.NUM.", false);  
	         opcao1.add(m3);
	      	 m3.setBounds(100,170,100,40);
	      	 
         sim = new JRadioButton("Sim", false);
         	opcao2.add(sim);
      		sim.setBounds(100,260,50,20);
      		
      	 sair = new JRadioButton("Sair", false);    
        	opcao2.add(sair);
        	sair.setBounds(150,260,100,20);
         
         ArrayList<JRadioButton> lista = new ArrayList<JRadioButton>();    
            
         lista.add(m1);
         lista.add(m2);
         lista.add(m3);
         add(sim);
         add(sair);
      	
         m1.addItemListener(altera);
         m2.addItemListener(altera);
         m3.addItemListener(altera);
         sim.addItemListener(altera);
         sair.addItemListener(altera);
       
         Iterator<JRadioButton> iRadio = lista.iterator();
            
         while (iRadio.hasNext()) {
         
             add((JRadioButton)iRadio.next());
         }
        
    }
    
    private class RadioButtonAltera implements ItemListener{
    	
        public void itemStateChanged(ItemEvent event) {
        	
            if(m1.isSelected() && sim.isSelected()) {
                JOptionPane.showMessageDialog(null,"Sua matricula em POO foi cancelada!"," Requerimento nº 000-1", JOptionPane.PLAIN_MESSAGE); 
                System.exit(1);
            
            }else if(m2.isSelected() && sim.isSelected()) {
             JOptionPane.showMessageDialog(null,"Sua matricula em ED2 foi cancelada!"," Requerimento nº 000-2", JOptionPane.PLAIN_MESSAGE); 
             System.exit(1);
            
            }else if(m3.isSelected() && sim.isSelected()) {
                 JOptionPane.showMessageDialog(null,"Sua matricula em CALC. NUM foi cancelada!"," Requerimento nº 000-3", JOptionPane.PLAIN_MESSAGE); 
                 System.exit(1);
            
            }else if(sair.isSelected()) {
                JOptionPane.showMessageDialog(null," Até a sua próxima dp!"," Sistema Academico", JOptionPane.PLAIN_MESSAGE); 
                System.exit(1);
           
           }
        }    
    }
    
    public static void main (String args[ ]){
    	
        Principal p = new Principal();
        
        p.setTitle(" Sistema Academico");
        p.setSize(300,400);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setLocationRelativeTo(null);
        p.setVisible(true);         
        
    }
}