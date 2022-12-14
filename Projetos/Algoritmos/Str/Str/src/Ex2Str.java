package com.mycompany.proj;

import java.util.Scanner;

public class Ex2Str {
    public static void main(String[] args) {
        String frase;
        int num_pala=0;
        Scanner lei=new Scanner(System.in);
        System.out.println("Digite a frase: ");
        frase=lei.nextLine();
        if(frase.length()>0){
            num_pala=1;
            for (int i=0; i<frase.length(); i++){
                if(frase.charAt(i)==' '){
                    num_pala++;
                }
            }
        }
         System.out.println("O Numero de Palavras da Frase: ["+frase+"] nº"+num_pala);
    }
}
