package Ex2;

import java.util.Scanner;

public class Main{
     public static void main(String [] args){
        Scanner lei= new Scanner(System.in);
         System.out.println("Digite a base e a altura do triangulo: ");
        Triangulo Tri = new Triangulo(lei.nextDouble(), lei.nextDouble());
        
        System.out.printf("A area do triangulo é %.2f\n",Tri.Area());
    }
}
