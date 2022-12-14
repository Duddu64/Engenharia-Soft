package Ex1;
import java.util.Scanner;

public class Ex2Str2 {
	 public static void main(String[] args) {
	        String frase;
	        Scanner lei=new Scanner(System.in);
	        System.out.println("Digite a frase: ");
	        frase=lei.nextLine();
	        String[] pala = frase.split(" ");
	            /*for (int i=0; i<pala.length; i++){
	                if(frase.charAt(i)==' '){
	                    num_pala++;
	                }*/
	         System.out.println("O Numero de Palavras da Frase: ["+frase+"] nº"+pala.length);
		     lei.close();
	 }
}
