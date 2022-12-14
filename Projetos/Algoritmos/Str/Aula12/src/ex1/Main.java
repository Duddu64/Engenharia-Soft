package ex1;

import java.util.Scanner;

public class Main {
     public static void main(String[] args){
        Scanner lei= new Scanner(System.in);
        
        Pessoa A = new Pessoa();
        System.out.println("Digite o nome da Pessoa e sua Idade: ");
        A.setNome(lei.nextLine());
        lei.nextLine();
        A.setIdade(lei.nextInt());
        
         System.out.println("Gostaria de ver os dados da Pessoa Registrada: 1.Sim ou 0.Não");
        if(lei.nextInt()==1){
            System.out.println("Nome: "+A.getNome());
            System.out.println("Idade: "+A.getIdade());
        }
    }
}
