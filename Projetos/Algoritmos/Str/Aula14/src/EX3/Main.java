package EX3;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner lei = new Scanner (System.in);
        Cliente A = new Cliente();
        Vendedor B = new Vendedor();
        Gerente C = new Gerente();
        int op;
        do {
	        System.out.println("Deseja cadastrar um Empregado, Cliente ou Vendedor: 1.Cliente 2.Gerente 3.Vendedor 4.Sair");
	        op= lei.nextInt();
	        if(op==1) {
	        	lei.nextLine();
	        	System.out.println("Digite o nome do cliente: ");
	        	A.setNome(lei.nextLine());
	        	System.out.println("Digite o sexo do cliente: ");
	        	A.setSexo(lei.nextLine());
	        	lei.nextLine();
	        	System.out.println("Digite a idade do cliente: ");
	        	A.setIdade(lei.nextInt());
	        	System.out.println("Digite o valor da dívida do cliente: ");
	        	A.setValorDivida(lei.nextDouble());
	        	System.out.println("Digite o ano de nascimento do cliente: ");
	        	A.setAnonasc(lei.nextInt());
	        }else {
	        	if(op==2) {
	        		lei.nextLine();
	        		System.out.println("Digite o nome do Gerente: ");
	            	C.setNome(lei.nextLine());
	            	lei.nextLine();
	            	System.out.println("Digite a idade do Gerente: ");
	            	C.setIdade(lei.nextInt());
	            	System.out.println("Digite o salario do Gerente: ");
	            	C.setSalarioBase(lei.nextDouble());
	            	lei.nextLine();
	            	System.out.println("Digite o nome da gerencia: ");
	            	C.setNomeGerencia(lei.nextLine());
	            	System.out.println("Digite a matricula do Gerente: ");
	            	C.setMatricula(lei.nextLine());
	            	
	            	
	        	}else {
	        		if(op==3) {
	        			lei.nextLine();
	        			System.out.println("Digite o nome do Vendedor: ");
	                	B.setNome(lei.nextLine());
	                	lei.nextLine();
	                	System.out.println("Digite o salario do Vendedor: ");
	                	B.setSalarioBase(lei.nextDouble());
	                	System.out.println("Digite o valor das vendas do vendedor: ");
	                	B.setValorVendas(lei.nextDouble());
	                	System.out.println("Digite a Quantidade de vendas: ");
	                	B.setQuantVendas(lei.nextInt());
	        		}
	        	}
	        }
        }while(op!=4);
        System.out.println("Deseja imprimir os dados do Empregado, Cliente ou Vendedor: 1.Cliente 2.Gerente 3.Vendedor");
        int op2= lei.nextInt();
        if(op2==1) {
        	System.out.println(A.PrintDados());
        }else {
        	if(op2==2) {
        		System.out.println(C.PrintDados());
        	}else {
        		if(op2==3) {
        			System.out.println(B.PrintDados());
        		}
        	}
        }
    }
}
