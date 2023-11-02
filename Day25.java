
package day25;

import java.util.Scanner;

public class Day25 {

    public static void main(String[] args) {
       Scanner tasya = new Scanner(System.in);
       int panjang, lebar;
       
        System.out.print("Masukkan nilai panjang    : ");
        panjang = tasya.nextInt();
        
        System.out.print("Masukkan nilai lebar      : ");
        lebar = tasya.nextInt();
        
        int luas = panjang*lebar;
        int keliling = 2*(panjang+lebar);
        
        System.out.println("Luas persegi panjang        = " + luas +"cm");
        System.out.println("Keliling persegi panjang    = " + keliling + "cm");
    }
    
}
