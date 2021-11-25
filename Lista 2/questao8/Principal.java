package questao8;

import javax.swing.JOptionPane;

public class Principal {

	public static void iniciar() {
		
		JOptionPane.showMessageDialog(null, "Para logar digite o login e a senha correta");
		String login = pedirLogin();
		String senha = pedirSenha();
		exibirResposta(login, senha);
		
	}//iniciar

	public static String pedirLogin() {
		
		String texto1 = JOptionPane.showInputDialog(" Digite o login: ");
		
		return texto1;
	}
	
	public static String pedirSenha() {
			
		String texto2 = JOptionPane.showInputDialog(" Digite a senha: ");
		
		return texto2;
	}
	
	public static void exibirResposta(String texto1, String texto2) {
		
		if( texto1.equals("jose") && texto2.equals("senha123")) {
			JOptionPane.showMessageDialog(null, " Bem Vindo " + texto1 + "!", " Sucesso!", JOptionPane.PLAIN_MESSAGE);
		
		}else {
			JOptionPane.showMessageDialog(null, " Email ou senha incorretos", "Erro!", JOptionPane.ERROR_MESSAGE);
		}
	    
	}
	
	public static void main(String[] args) {
		
		iniciar();
		
	}
}
