
package day7;

import java.util.Scanner;

public class Day7 {
    
    public static void main(String[] args) {
      int nilai;
      String nama;
      Scanner cek = new Scanner(System.in);
      
        System.out.print("Masukkan nama : ");
        nama = cek.nextLine();
        System.out.print("Masukkan nilai : ");
        nilai = cek.nextInt();
        
        if (nilai >= 70){
            System.out.println("Selamat "  + nama +  " Anda dinyatakan lulus");
            
        }    else {
            System.out.println(nama  +  " Anda mengulang");
        }
        
    }
    
}
