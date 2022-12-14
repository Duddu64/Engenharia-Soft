package ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner lei= new Scanner(System.in);
        
        Funcionario A= new Funcionario();
        System.out.println("Digite o Salario do Funcionário: ");
        A.setSalario(lei.nextDouble());
        System.out.println("Digite a Idade do Funcionário: ");
        A.setIdade(lei.nextInt());
        System.out.println("Digite o Tempo de Serviço do Funcionário: ");
        A.setAnosSer(lei.nextInt());
        
        Funcionario B = new Funcionario();
        System.out.println("Digite o Salario do Funcionário: ");
        B.setSalario(lei.nextDouble());
        System.out.println("Digite a Idade do Funcionário: ");
        B.setIdade(lei.nextInt());
        System.out.println("Digite o Tempo de Serviço do Funcionário: ");
        B.setAnosSer(lei.nextInt());
        
        A.Imprime();
        B.Imprime();
    }
}
