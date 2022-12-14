package ex7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner lei= new Scanner(System.in);
        
        Livro A= new Livro();
        
        System.out.println("Digite o titulo do livro: ");
        A.setTitulo(lei.next());
        System.out.println("Digite a editora do livro: ");
        A.setEditora(lei.next());
        System.out.println("Digite o código do livro: ");
        A.setCodigo(lei.nextInt());
        System.out.println("Digite o ano do livro: ");
        A.setAno(lei.nextInt());
        System.out.println("Digite o preço do livro: ");
        A.setPreco(lei.nextDouble());
        
        System.out.println("Digite o preço, ano, codigo, editora e o titulo do livro: ");
        
        Livro B= new Livro(lei.nextDouble(),lei.nextInt(),lei.nextInt(),lei.next(),lei.next());
        
        if(A.getPreco()>B.getPreco()) {
        	System.out.println("Titulo: "+A.getTitulo()+"\nCódigo: "+A.getCodigo());
        }else {
        	System.out.println("Titulo: "+B.getTitulo()+"\nCódigo: "+B.getCodigo());
        }
    }
}
