import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Insira o 1° número: ");
	    int num1 = sc.nextInt();
	    
	    System.out.println("\nInsira o 2° número: ");
	    int num2 = sc.nextInt();
	    
	    int i = 1;
	    int res = 0;
	    
	    do {
	        
	      System.out.printf(num1 + ",");
	      res = num1 + num2;
	      num1 = num2;
	      num2 = res;
	      i++;
	        
	    } while (i <= 20);
	   
	}