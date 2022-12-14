package ex8;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Calculadora A= new Calculadora();
		double B, C;
		int op=0, op2=0;
		do {
			System.out.println("\nDigite o valor 1 e o valor 2 : ");
			A.SetA_B(ent.nextDouble(), ent.nextDouble());
			
			System.out.println("Digite a operação desejada : \n1.Soma\n2.Subtração\n3.Multiplicação\n4.Divisão\n0.Sair");
			op=ent.nextInt();
				
			if(op==1) {
				System.out.println("Resultado: "+A.Soma());
			}else {
				if(op==2) {
					System.out.println("Resultado: "+A.Sub());	
				}else {
					if(op==3) {
						System.out.println("Resultado: "+A.Multi());
					}else {
						if(op==4) {
							System.out.println("Resultado: "+A.Div());
						}
					}
				}
			}
		}while(op!=0);
	}

}
