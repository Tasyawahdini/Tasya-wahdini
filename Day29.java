
package day29;

import java.util.Scanner;

public class Day29 {

    
    public static void main(String[] args) {
         Scanner abc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        
        int angka = abc.nextInt();
        for (int i = 1; i <= angka; i++) {
            
        if (i % 3 == 0){
            System.out.println(i);
        }
            
        }
      
    }
    
}
