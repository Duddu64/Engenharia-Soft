package ex9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite o Nome do Titular e o Número da Conta: ");
		Conta A= new Conta(ent.nextLine(), ent.nextInt());
		ent.nextLine();
		System.out.println("Digite qual o tipo de conta (Corrente ou Poupança): ");
		A.setTipo(ent.nextLine());
		int op;
		do {
			System.out.println("Digite a operação desejada : \n1.Realizar Depósito\n2.Realizar Saque\n3.Mostrar Saldo\n4.Mostrar Insformações do Titular\n0.Sair");
			op=ent.nextInt();
				
			if(op==1) {
				System.out.println("Digite o valor do deposito: ");
				A.Depositar(ent.nextDouble());
			}else {
				if(op==2) {
					System.out.println("Digite o valor do Saque: ");
					A.Sacar(ent.nextDouble());	
				}else {
					if(op==3) {
						System.out.println("Saldo: "+A.getSaldo());
					}else {
						if(op==4) {
							System.out.println("Titular: "+A.getNome()+"\nTipo de Conta: "+A.getTipo()+"\nNúmero da Conta: "+A.getNumero());
						}
					}
				}
			}
		}while(op!=0);
	}
}
