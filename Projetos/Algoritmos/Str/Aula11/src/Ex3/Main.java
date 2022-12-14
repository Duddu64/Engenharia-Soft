package Ex3;
import java.util.Scanner;

public class Main {
     public static void main(String [] args){
        Scanner lei= new Scanner(System.in);
         System.out.println("Digite os dados da empresa 0: ");
         System.out.println("Nome: ");
         String nome = lei.nextLine();
         System.out.println("Endereço: ");
         String end = lei.nextLine();
         System.out.println("Cidade: ");
         String cid = lei.nextLine();
         System.out.println("Estado: ");
         String est = lei.nextLine();
         System.out.println("Valor Patrimonial da Empresa: ");
         double Val = lei.nextDouble();
         System.out.println("Quantidade de funcionários: ");
         int Q = lei.nextInt();
        
         Empresa A= new Empresa(nome, end, cid, est, Val, Q);
         lei.nextLine();
         System.out.println("\n\nDigite os dados da empresa 1: ");
         System.out.println("Nome: ");
         nome = lei.nextLine();
         System.out.println("Endereço: ");
         end = lei.nextLine();
         System.out.println("Cidade: ");
         cid = lei.nextLine();
         System.out.println("Estado: ");
         est = lei.nextLine();
         System.out.println("Valor Patrimonial da Empresa: ");
         Val = lei.nextDouble();
         System.out.println("Quantidade de funcionários: ");
         Q = lei.nextInt();
         
         Empresa B= new Empresa(nome, end, cid, est, Val, Q);
         
         if(A.ValorPatrimonial>B.ValorPatrimonial){
             A.Imprime();
         }else{
             B.Imprime();
         }
    }
}
