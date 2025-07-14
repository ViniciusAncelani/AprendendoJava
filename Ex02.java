import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
        int i = 1;
        int fatorial = 1;
        
        System.out.println("Digite o número: ");
        int numeros = read.nextInt();
        
        while(i <= numeros) {
            fatorial *= i;
            i++;
        }
        System.out.println("O fatorial do número é: " + fatorial);
    }    