package questao10;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class CampoTexto extends JFrame implements ActionListener{

    private static final CampoTexto texto = new CampoTexto();
    private JTextField campoTexto;  
    private JButton jb = new JButton("Sair");
    private JButton jb1 = new JButton("Limpar");
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == jb) {
        	System.exit(1);
        	
        }else if(e.getSource() == jb1) {
        	
        	campoTexto.setText("");
        }
        
    }
    
	private CampoTexto() {
		     
        setLayout(null);      
        
        campoTexto = new JTextField(10); 
        campoTexto.setBounds(100,50,200,20);
        jb.addActionListener(this);
        jb.setBounds(210,100,100,40); 
        jb1.addActionListener(this);
        jb1.setBounds(90,100,100,40); 
 
        add(campoTexto);
        add(jb);
        add(jb1);
        
        setTitle(" Digite uma frase!");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);    
    
	}

	public static CampoTexto getTexto() {
        return texto;
    }
}
