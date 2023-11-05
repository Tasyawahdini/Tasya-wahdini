package day28;

import java.util.Scanner;

public class Day28 {
    
    public static void main(String[] args) {
        
       Scanner caca = new Scanner(System.in);
       String nama, alamat, pekerjaan;
       int usia, gaji;
       
        System.out.println("=========================================");
        System.out.println("        Isi data dibawah ini        ");
        System.out.println("-----------------------------------------");
        System.out.print("Masukkan nama karyawan        : ");
        nama = caca.nextLine();
        System.out.print("Masukkan alamat               : ");
        alamat = caca.nextLine();
        System.out.print("Masukkan usia karyawan        : ");
        usia = caca.nextInt();
        System.out.print("Masukkan gaji karyawan        : ");
        gaji = caca.nextInt();
        
        if (gaji == 10000000){
            pekerjaan = "OB";
        } else if (gaji == 2000000){
            pekerjaan = "Security";
        } else if (gaji == 3000000){
            pekerjaan = "Kasir";
        } else if (gaji == 5000000){
            pekerjaan = "Manager";
        } else {
            pekerjaan = "Tidak terdeteksi";
        }
        
        System.out.println("=========================================");
        System.out.println("            Data Karyawan         ");
        System.out.println("-----------------------------------------");
        System.out.println("Nama karyawan   : " + nama);
        System.out.println("Alamat          : " + alamat);
        System.out.println("usia            : " + usia + " Tahun");
        System.out.println("Gaji            : " + gaji);
        System.out.println("Pekerjaan       : " + pekerjaan);
        System.out.println("=========================================");
    }
}
