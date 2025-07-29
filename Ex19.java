import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o primerio número: ");
	    int num = sc.nextInt();
	    
	    System.out.println("Digite o segundo número: ");
	    int num2 = sc.nextInt();
	    
	    int res = num * num2;
	    int find = 0;
	    
	    do {
	        
	    find += num;
	    
	    if(find == res){
	        break;
	    }
	 
	    } while (find <= res);
	    
	    System.out.println("\nA multiplicação de dois números através de somas sucessivas é: " + find);
	    
	}
}