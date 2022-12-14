package ex2;

import java.util.Scanner;

public class Main {
     public static void main(String[] args){
        Scanner lei= new Scanner(System.in);
        
        Bola A = new Bola();
        System.out.println("Digite o Material: ");
        A.setMaterial(lei.nextLine());
        System.out.println("Digite a Cor: ");
        A.setCor(lei.nextLine());
        lei.nextLine();
        System.out.println("Digite a Circuferência da bola: ");
        A.setCircuf(lei.nextDouble());


        
         System.out.println("Gostaria de ver os dados da Bola: 1.Sim ou 0.Não");
        if(lei.nextInt()==1){
            System.out.println("Bola: \nCor: "+A.getCor()+"\nMaterial: "+A.getMaterial()+"\nCircuferência: "+A.getCircuf());
        }
    }
}
