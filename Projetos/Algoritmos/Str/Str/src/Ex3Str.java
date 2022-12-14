package com.mycompany.proj;
import java.util.Scanner;

public class Ex3Str {
    public static void main(String[] args) {
        String frase;
        Scanner lei=new Scanner(System.in);
        System.out.println("Digite a frase: ");
        frase=lei.nextLine();
        for (int i=0; i<frase.length(); i++){
            if(frase.charAt(i)=='a'||frase.charAt(i)=='i'||frase.charAt(i)=='e'||frase.charAt(i)=='o'||frase.charAt(i)=='u'||frase.charAt(i)=='A'||frase.charAt(i)=='I'||frase.charAt(i)=='E'||frase.charAt(i)=='O'||frase.charAt(i)=='U'){
                frase=frase.replace(frase.charAt(i), '*');
            }
        }
         System.out.println("A Frase Criptografada: ["+frase+"]. ");
    }
}
