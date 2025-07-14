import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

    Scanner read = new Scanner(System.in);
    
    double num[] = new double[10];
    int i = 1;
    
    while(i <= 10){
        System.out.println("Digite o número");
        num[i] = read.nextDouble();
        double res = num[i] / 2;
        System.out.println("A metade do número é: " + res);
        i++;
        }
    }
}