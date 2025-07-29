import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int i = 1;
	   int res = 0;
	   
	   do {
	       
	       System.out.println("Digite um número: ");
	       int num = sc.nextInt();
	       
	       if (num * num < 225) {
	            res += num;
	       }
	       
	   } while (i <= 20);
	    
	    System.out.println("A soma dos números cujos quadrados são menores do que 225 é: " + res);
	    
	}
}