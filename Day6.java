package day6;

import java.util.Scanner;

public class Day6 {
    
    public static void main(String[] args) {
       
       System.out.println("Operator aritmatika");
       int nilai1;
       int nilai2;
       int hasil;
       
       Scanner operator = new Scanner(System.in);
       
        System.out.println("Penjumlahan");
        System.out.print("Masukkan nilai 1 : ");
        nilai1 = operator.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        nilai2 = operator.nextInt();
        
        hasil = nilai1 + nilai2;
        System.out.println("Hasil dari penjumlahan diatas adalah = " + hasil);
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("Perkalian");
        System.out.print("Masukkan nilai 1 : ");
        nilai1 = operator.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        nilai2 = operator.nextInt();
       
        hasil = nilai1 * nilai2;
        System.out.println("Hasil dari perkalian diatas adalah = " + hasil);
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("Pembagian");
        System.out.print("Masukkan nilai 1 : ");
        nilai1 = operator.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        nilai2 = operator.nextInt();
       
        hasil = nilai1 / nilai2;
        System.out.println("Hasil dari Pembagian diatas adalah = " + hasil);
        
        System.out.println("----------------------------------------------");
        System.out.println("Operator penugasan");
        int a;
        int b;
        
        //Pengisian nilai
        a =15;
        b = 3;
        
        //Penambahan
        b += a;
        System.out.println("Penambahan ; " + b);
        
        //Pengurangan
        b -= a;
        System.out.println("Pengurangan : " + b);
        
        System.out.println("---------------------------------------------");
        System.out.println("Operator pembanding");
        
        int angka1 = 20;
        int angka2 = 4;
        boolean hasil1;
        
        
        hasil1 = angka1 > angka2;
        System.out.println("Apakah angka 1 lebih besar dari angka 2 ? : " +  hasil1);
        
        hasil1 = angka1 < angka2;
        System.out.println("Apakah angka 1 lebih kecil dari angka 2 ? : " + hasil1);
        
        hasil1 = angka1 == angka2;
        System.out.println("Apakah angka 1 sama dengan angka 2 ? : " + hasil1);
        
        hasil1 = angka1 != angka2;
        System.out.println("Apakah angka 1 tidak sama dengan angka 2 ? : " + hasil1);
        
        System.out.println("-------------------------------------------------------");
        System.out.println("Operator Logika");
        
        boolean a1 = true;
        boolean b2 = false;
        boolean c3;
        
        //konjungsi (dan)
        c3 = a1 && b2;
        System.out.println("true && false = " + c3);
        
        //disjungsi (atau)
        c3 = a1 || b2 ;
        System.out.println("true || false = " + c3);
        
        //negasi (bukan)
        System.out.println("Negasi, !true = " + !a1);
    }
    
}
