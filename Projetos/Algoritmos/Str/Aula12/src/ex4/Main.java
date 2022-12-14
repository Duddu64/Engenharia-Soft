package ex4;

import java.util.Scanner;

public class Main {
     public static void main(String[] args){
        Scanner lei= new Scanner(System.in);
        
        Aluno Alun1 = new Aluno();
        System.out.println("Digite a matricula do Aluno: ");
        Alun1.setMatricula(lei.nextLine());
        System.out.println("Digite a nota 1 do Aluno: ");
        Alun1.setNota1(lei.nextDouble());
        System.out.println("Digite a nota 2 do Aluno: ");
        Alun1.setNota2(lei.nextDouble());
        
        Alun1.ImprimeDados();
    }
}
