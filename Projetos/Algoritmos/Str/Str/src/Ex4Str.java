
package com.mycompany.proj;

import java.util.Scanner;

public class Ex4Str {
    public static void main(String[] args) {
        String frase;
        int v=0;
        Scanner lei=new Scanner(System.in);
        System.out.println("Digite a frase: ");
        frase=lei.nextLine();
        char frase2[]=new char [frase.length()];
        for (int i=(frase.length()-1); i>=0; i--){
            if(frase.charAt(i)=='a'||frase.charAt(i)=='i'||frase.charAt(i)=='e'||frase.charAt(i)=='o'||frase.charAt(i)=='u'||frase.charAt(i)=='A'||frase.charAt(i)=='I'||frase.charAt(i)=='E'||frase.charAt(i)=='O'||frase.charAt(i)=='U'){
                frase2[v]=frase.charAt(i);
            }
            
            else{
                frase2[v]='*';
            }
            v++;
        }
        /**/
        for(int cont=0; cont<frase2.length; cont++){
            System.out.print(frase2[cont]);    
        }
        
    }
}
