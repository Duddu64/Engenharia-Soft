package Ex1;
import java.util.Scanner;


public class Main {
    public static void main(String [] args){
        Scanner lei= new Scanner(System.in);
        System.out.println("Digite o salario do primeiro gerente: ");
        Gerente Luiz = new Gerente(lei.nextDouble());
        System.out.println("Digite o salario do segundo gerente: ");
        Gerente Eduardo = new Gerente(lei.nextDouble());
        Luiz.AumentoSalarial();
        System.out.printf("O novo salario é %.2f\n",Luiz.Salario);
        Eduardo.AumentoSalarial(60);
        System.out.printf("O novo salario é %.2f\n16",Eduardo.Salario);
    }
}
