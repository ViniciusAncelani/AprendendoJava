import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner read = new Scanner(System.in);
    
    int i = 5;
    int j = 3;
    
    while(i <= 500){
        System.out.print(i + "|");
        System.out.print(j + "|");
        i += 5;
        j += 3;
        }
    }
}