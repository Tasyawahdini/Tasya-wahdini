package day31;

import java.util.Scanner;

public class Day31 {

    public static void main(String[] args) {
       Scanner jisoo = new Scanner(System.in); 
       int nilai1, nilai2, nilai3;
       String hasil = null;
       
        System.out.print("Masukkan nilai 1  : ");
        nilai1 = jisoo.nextInt();
        System.out.print("Masukkan nilai 2  : ");
        nilai2 = jisoo.nextInt();
        System.out.print("Masukkan nilai 3  : ");
        nilai3 = jisoo.nextInt();
        System.out.println("----------------------------------------");
        
        int total = nilai1 + nilai2 + nilai3;
        int rataNilai = (nilai1 + nilai2 + nilai2)/3 ;
        if (rataNilai >= 70){
            hasil = "Selamat, anda dinyatakan LULUS";
        } else if (rataNilai < 70){
            hasil = "Anda GAGAL, sampai jumpa tahun depan";
        }
        
        System.out.println("Nilai 1                     = " + nilai1);
        System.out.println("Nilai 2                     = " + nilai2);
        System.out.println("Nilai 3                     = " + nilai3);
        System.out.println("Jumalah nilai keseluruhan   = " + total);
        System.out.println("Nilai rata-rata             = " + rataNilai);
        System.out.println("Hasil                       = " + hasil);
    }
    
}
