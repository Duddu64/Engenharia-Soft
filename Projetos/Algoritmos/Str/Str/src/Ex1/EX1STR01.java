package Ex1;
import java.util.Scanner;

public class EX1STR01 {

	public static void main(String[] args) {
        String frase;
        int num_vog=0;
        Scanner lei=new Scanner(System.in);
        System.out.println("Digite a frase: ");
        frase=lei.nextLine();
        for (int i=0; i<frase.length(); i++){
            if(frase.charAt(i)=='a'||frase.charAt(i)=='i'||frase.charAt(i)=='e'||frase.charAt(i)=='o'||frase.charAt(i)=='u'||frase.charAt(i)=='A'||frase.charAt(i)=='I'||frase.charAt(i)=='E'||frase.charAt(i)=='O'||frase.charAt(i)=='U'){
                num_vog++;
            }
        }
         System.out.println("O Numero de Vogais da Frase: ["+frase+"] nº"+num_vog);
	     lei.close();
	}
}
