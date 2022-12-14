package ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner lei= new Scanner(System.in);
        
        Circulo A= new Circulo();
        System.out.println("Digite o raio do circulo: ");
        A.setRaio(lei.nextDouble());
        
        A.Imprime();
    }
}
