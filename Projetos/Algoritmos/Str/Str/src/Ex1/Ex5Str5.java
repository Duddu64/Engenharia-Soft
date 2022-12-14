package Ex1;
import java.util.Scanner;

public class Ex5Str5 {
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
	     }while(k<Pala.length);
	     lei.close();
	 }
}
