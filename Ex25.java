mport java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int i = 1;
	    int pares = 0;
	    int impares = 0;
	    int num = 0;
	    
	    System.out.println("Digite a quantidade de números que você quer digitar: ");
	    int amount = sc.nextInt();
	    
	    do {
	        
	     System.out.println("Digite um número: ");
	     num = sc.nextInt();
	        
	     if(num % 2 == 0){
	         pares++;
	     } else {
	         impares++;
	     }
	     
	     i++;
	        
	    } while(i <= amount);
	    
	    System.out.println("\nA quantidade de números pares inseridos foi: " + pares);
	    System.out.println("\nA quantidade de números ímpares inserida foi: " + impares);
	}
}