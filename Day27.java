package day27;

import java.util.Scanner;

public class Day27 {

    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        int nilai;
        String nama, nim,predikat, jurusan;
        
        System.out.println("    Nilai mahasiswa     ");
        System.out.println("----------------------------------------");
        
        System.out.print("Masukkan nama mahasiswa   : ");
        nama = cc.nextLine();
        System.out.print("Masukkan nim mahasiswa    : ");
        nim = cc.nextLine();
        System.out.print("Masukkan jurusan          : ");
        jurusan = cc.nextLine();
        System.out.print("Masukkan nilai            : ");
        nilai = cc.nextInt();
        
        if (nilai >=80 ) {
            predikat = "A";
            
        } else if (nilai >=70 ){
            predikat = "B";
            
        } else if (nilai >=60 ){
            predikat = "C";
            
        } else if (nilai >=50){
            predikat = "D";
            
        } else {
            predikat = "E";
        }
        System.out.println("----------------------------------------");
        System.out.println("Nama mahasiswa  = " + nama);
        System.out.println("Nim mahasiswa   = " + nim);
        System.out.println("Jurusan         = " + jurusan);
        System.out.println("Nilai anda      = " + nilai);
        System.out.println("Predikat        = " + predikat);
    }
    
}
