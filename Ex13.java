import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) {
    
    Scanner read = new Scanner(System.in);
    
    int i = 1;
    double res = 0;
    
    System.out.println("Digite a base: ");
    double base = read.nextDouble();
            
    System.out.println("Digite o expoente: ");
    double expoente = read.nextDouble();

    if(base % i == 0 && expoente % i == 0 && base >= 2 && expoente > 1){
        res = Math.pow(base,expoente);
        System.out.println("O resultado da potência é: " + res);
        } else {
            System.out.printf("O número não é inteiro!");
            read.close();
        }         
    }
}