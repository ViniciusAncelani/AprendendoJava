import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite a quantidade de números que irá inserir: ");
	    int amount = sc.nextInt();
	    
	    int bigger = 0;
	    int i = 1;
	    
	    do {
	        
	        System.out.println("\nDigite um número: ");
	        int num = sc.nextInt();
	        
	        System.out.println("\nDigite outro número: ");
	        int other = sc.nextInt();
	        
	        bigger = Math.min(num, other);

	        i++;
	        
	    } while (i <= amount - 2);
	    
            System.out.println("\nO menor número inserido foi: " + bigger);
	}
}