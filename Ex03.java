import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        
        Scanner read = new Scanner(System.in);

        System.out.println("Insira o último número");
        int last = read.nextInt();

        int a = 0, b = 1; 

        System.out.println("A série de Fibonacci é: ");
        while(a <= last){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}