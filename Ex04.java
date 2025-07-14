import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner read = new Scanner(System.in);
        
        int i = 2;
        boolean primo = true;
        
        System.out.println("Insira o número: ");
        int num = read.nextInt();
        
        while(i < num){
          if(num % i != 0){
             primo = true;          
          } else {
            primo = false;
            break;
          }
          i++;
        }
        
        if(primo == true){
            System.out.println("É um número primo");
        } else {
            System.out.println("Não é um número primo");
        }
            }
        }
