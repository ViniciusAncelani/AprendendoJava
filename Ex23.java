import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int i = 1;
	   double res1 = 0;
	   double res2 = 0;
	   
	   do {
	       
	       System.out.println("Digite um número: ");
	       int num = sc.nextInt();
	       
	       res1 += num;
	 
	       i++;
	       
	   } while (i <= 10);
	 
	    res2 = res1 / 10; 
	    
	    System.out.println("A média dos números inseridos é: " + res2);
	    
	}
}