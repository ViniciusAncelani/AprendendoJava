import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o 1° número: ");
        int n1 = sc.nextInt();
        
        System.out.println("Digite o 2° número: ");
        int n2 = sc.nextInt();

        int i = 1;
        
        do {
            
        if (i % 2 != 0) { 
                n1 = n1 + n2;
            } else { 
                n2 = n1 - n2;
            }
            
            System.out.println(n1);
            System.out.println(n2);

            i++;
            
        } while (i <= 20);
	    
	    sc.close();
	    
	}
}