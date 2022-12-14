package EX1;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner lei = new Scanner (System.in);
        Fornecedor oy = new Fornecedor();
        System.out.println("Deseja cadastrar um Empregado ou um Fornecedor: 1.Fornecdor 2.Empregado ");
        //if(lei.nextInt()==1)
            System.out.println("Digite o nome, telefone, endereco do Fornecedor: ");
            oy.Ent_Dados(lei.next(), lei.next(), lei.next());
            System.out.println("Digite o crédito do fornecedor: ");
            oy.setValorCredito(lei.nextDouble());
            System.out.println("Digite o montante da dívida do Fornecedor: ");
            oy.setValorDivida(lei.nextDouble());
        /*else{
            System.out.println("Digite a descrição do carro: ");
            car.setDescricao(lei.next());
            System.out.println("Digite a quilometragem do carro: ");
            car.setQuilometragem(lei.nextInt());
            System.out.println("Digite a capacidade de pessoas no carro: ");
            car.setCapacidade(lei.nextInt());
        }*/
    }
}
