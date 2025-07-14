Ex06

import java.util.Scanner;
                       
public class Main {
    public static void main (String[] args){
        
     Scanner read = new Scanner(System.in); 
     
     System.out.println("Digite o 1° número: ");
     int num1 = read.nextInt();
     
     System.out.println("Digite o 2° número: ");
     int num2 = read.nextInt();
     
     int i = 1;
     int res1, res2;
     boolean mmc = false;

     while (!mmc) {
       res1 = num1 * i;
       int j = 1;
       
     while (true){
       res2 = num2 * j;
       
       if(res1 == res2){
          mmc = true;
          System.out.println("O MMC entre os 2 números é: " + res1);
          break;
        } else if(res2 > res1){
          break;
        }
      j++;
     }
      i++;
    }
    
  }
}