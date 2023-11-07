package day30;

import java.util.Scanner;

public class Day30 {

    public static void main(String[] args) {
       Scanner tb = new Scanner(System.in);
       String namaDepan, namaBelakang;
       
        System.out.print("Masukkan nama depan       : ");
        namaDepan = tb.nextLine();
        System.out.print("Masukkan nama belakang    : ");
                
        namaBelakang = tb.nextLine();
        System.out.println("--------------------------");
        
        System.out.println("Nama depan      = " + namaDepan);
        System.out.println("Nama belakang   = " + namaBelakang);
        System.out.println("Nama panjang    = " + namaDepan + " " + namaBelakang);
       
    }
    
}
