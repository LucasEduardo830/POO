package questao_10;

import java.util.Scanner;

public class Principal {

public Principal() {

}

public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);

System.out.println("\nNome do aluno:");
String nome = entrada.nextLine();

System.out.println("\nEmail do aluno:");
String email_aluno = entrada.nextLine();

System.out.println("\nCpf do aluno:");
String cpf = entrada.nextLine();

System.out.println("\nCurso:");
String curso = entrada.nextLine();

System.out.println("\nTelefone do aluno:");
String telefone = entrada.nextLine();

System.out.println("\nNome da Disciplina:");
String nome_dp = entrada.nextLine();

System.out.println("\nNome do Professor:");
String nome_professor = entrada.nextLine();

System.out.println("\nEmail do Professor:");
String email_professor = entrada.nextLine();

System.out.println("\nSala do Professor:");
String sala = entrada.nextLine();

System.out.println("\nCodigo da Disciplina:");
String codigo = entrada.nextLine();


System.out.println("\nNota 1:");
float nota1 = entrada.nextFloat();

System.out.println("\nNota 2:");
float nota2 = entrada.nextFloat();

Estudante et = new Estudante(nome, cpf, curso, email_aluno,
		nota1, nota2, telefone);

Disciplina dp = new Disciplina(nome_professor, nome_dp,
		email_professor,sala, codigo);


System.out.println(et);

Nota aux = new Nota (nota1, nota2);
System.out.println(aux + " " + dp);

}
}