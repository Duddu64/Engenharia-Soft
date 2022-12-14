package ex3;
import java.util.Scanner;

public class Main {
     public static void main(String[] args){
        Scanner lei= new Scanner(System.in);
        
        Quadrado A = new Quadrado();
        System.out.println("Digite o lado do quadrado: ");
        A.setLado(lei.nextInt());

        System.out.println("Quadrado: \nLado: "+A.getLado()+"\nArea do Quadrado: "+A.CalcularArea());
    }
}
