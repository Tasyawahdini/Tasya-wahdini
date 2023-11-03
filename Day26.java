package day26;

import java.util.Scanner;

public class Day26 {

    public static void main(String[] args) {
        Scanner bc = new Scanner(System.in);
        String nim, nama, alamat, jurusan;
        
        System.out.print("Masukkan nama anda      : ");
        nama = bc.nextLine();
        System.out.print("Masukkan nim anda       : ");
        nim = bc.nextLine();
        System.out.print("Masukkan jurusan anda   : ");
        jurusan = bc.nextLine();
        System.out.print("Masukkan alamat anda    : ");
        alamat = bc.nextLine();
        
        System.out.println("----------------------------------------");
        System.out.println("            DATA DIRI MAHASISWA         ");
        System.out.println("Nama    = " + nama);
        System.out.println("Nim     = " + nim);
        System.out.println("Jurusan = " + jurusan);
        System.out.println("Alamat  = " + alamat);
    }
    
}
