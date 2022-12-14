
package com.mycompany.proj;

import java.util.Scanner;

public class Ex5Str {
    public static void main(String[] args) {
        String frase;
        int k=0;
        Scanner lei=new Scanner(System.in);
        System.out.println("Digite a frase: ");
        frase=lei.nextLine();
        String Pala[]=frase.split(" ");
        do{
            System.out.println(Pala[k]);
            k++;
            if(Pala[k]==null){
                k=-1;
            }
        }while(k<0);
    }
}
