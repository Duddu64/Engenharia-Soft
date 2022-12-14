package EX4;

import java.util.Scanner;

public class ContasJava {
        public static void main(String[] args) {
        Scanner lei = new Scanner (System.in);
        ContaPoupança A = new ContaPoupança();
        ContaEspecial B = new ContaEspecial();
        
        A.setCliente("Luiz");
        A.setSaldo(5000);
        A.setNum_conta(6435);
        A.setDiaDeRendimento(2);
        
        B.setCliente("Eduardo");
        B.setSaldo(1000);
        B.setNum_conta(3654);
        B.setLimite(1000);
        int op;
        do {
	        System.out.println("Digite a operação desejada:\n \n1.Sacar \n2.Depositar \n3.Mostrar o Saldo \n4.Visualizar seus Dados \n5.Sair");
	        op= lei.nextInt();
	        if(op==1) {
	        	System.out.println("Digite o valor desejado pra saque: ");
	        	A.sacar(lei.nextDouble());
	        }else {
	        	if(op==2) {
	        		System.out.println("Digite o valor desejado para deposito: ");
	        		A.depositar(lei.nextDouble());
	        	}else {
	        		if(op==3) {
	        			A.calcularNovoSaldo();
	        			System.out.println("O novo saldo é: "+A.getSaldo());
	        		}else{
	        			if(op==4) {
	        				System.out.println("Cliente: "+A.getCliente()+"\nNúmero da conta: "+A.getNum_conta()+"\nSaldo Atual da Conta: "+A.getSaldo());
	        			}
	        		}
	        	}
	        }
        }while(op!=5);
        do {
	        System.out.println("Digite a operação desejada:\n \n1.Sacar \n2.Depositar \n3.Visualizar seus Dados \n4.Sair");
	        op= lei.nextInt();
	        if(op==1) {
	        	System.out.println("Digite o valor desejado para saque: ");
	        	B.sacar(lei.nextDouble());
	        }else {
	        	if(op==2) {
	        		System.out.println("Digite o valor desejado para deposito: ");
	        		B.depositar(lei.nextDouble());
	        	}else {
	        		if(op==3) {
	        			System.out.println("Cliente: "+B.getCliente()+"\nNúmero da conta: "+B.getNum_conta()+"\nSaldo Atual da Conta: "+B.getSaldo());
	        		}
	        	}
	        }
        }while(op!=4);
    }
}
