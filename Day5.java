package day5;

import java.util.Scanner;

public class Day5 {

    public static void main(String[] args) {
        
       int nilai1;
       int nilai2;
       int hasil;
       
       Scanner aritmatika = new Scanner(System.in);
       
        System.out.println("Penjumlahan");
        System.out.print("Masukkan nilai 1 : ");
        nilai1 = aritmatika.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        nilai2 = aritmatika.nextInt();
        
        hasil = nilai1 + nilai2;
        System.out.println("Hasil dari penjumlahan diatas adalah = " + hasil);
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("Perkalian");
        System.out.print("Masukkan nilai 1 : ");
        nilai1 = aritmatika.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        nilai2 = aritmatika.nextInt();
       
        hasil = nilai1 * nilai2;
        System.out.println("Hasil dari perkalian diatas adalah = " + hasil);
       
    }
    
}
