package EX2;

import java.util.Scanner;


public class Main {
        public static void main(String[] args) {
        Scanner lei = new Scanner (System.in);
	    System.out.println("Digite o nome e o sálario do Empregado: ");
	    Empregado B = new Empregado(lei.nextLine(),lei.nextDouble());
	        
	    lei.nextLine();
	    System.out.println("Digite o nome, o salario e a gratificação do Gerente: ");
	    Gerente A = new Gerente(lei.nextLine(),lei.nextDouble(), lei.nextDouble());
	        
        System.out.println("Deseja imprimir os dados do Empregado ou gerente : 1.Cliente 2.Gerente");
        int op2= lei.nextInt();
        if(op2==1) {
        	System.out.println(A.imprimeDados());
        }else {
        	if(op2==2) {
        		System.out.println(B.imprimeDados());
        	}
        }
    }
}
