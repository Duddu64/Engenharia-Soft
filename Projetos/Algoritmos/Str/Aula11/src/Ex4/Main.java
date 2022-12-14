package Ex4;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner lei= new Scanner(System.in);
         System.out.println("Digite os dados do aluno A: ");
         System.out.println("Nome: ");
         String nome = lei.nextLine();
         System.out.println("Código do aluno: ");
         int cd = lei.nextInt();
         System.out.println("Nota 1: ");
         double nota1 = lei.nextDouble();
         System.out.println("Nota 2: ");
         double nota2 = lei.nextDouble();
         
         Aluno A= new Aluno(cd, nome, nota1, nota2);
         lei.nextLine();
         Aluno B= new Aluno();
         System.out.println("\n\nDigite os dados do Aluno B: ");
         System.out.println("Nome: ");
         B.nome = lei.nextLine();
         System.out.println("Código do Aluno: ");
         B.codigo = lei.nextInt();
         System.out.println("Nota 1: ");
         B.nota1 = lei.nextDouble();
         System.out.println("Nota 2: ");
         B.nota2 = lei.nextDouble();
         
         A.CalculaMedia();
         B.CalculaMedia();
         
         System.out.println(A.Aluno_Aprov());
         System.out.println(B.Aluno_Aprov());
         
    }
}
