import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numeros = 0;
		int quadrados;
		
		while (numeros <= 15) {
		    System.out.println("Insira um número");
		    numeros = read.nextInt();
		    quadrados = numeros * numeros;
		    System.out.println("O Quadrado desse número é: " + quadrados);
		}
	}
}