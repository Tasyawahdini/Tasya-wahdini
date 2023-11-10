package day33;

import java.util.Scanner;

public class Day33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
            
        if (angka % 3 == 0 && angka % 5 == 0){
            System.out.println("Master class");
        } else if (angka % 3 == 0){
            System.out.println("Pride of 3");
        } else if (angka % 5 == 0){
            System.out.println("Pride of 5");
        }
           
    }
    
}
