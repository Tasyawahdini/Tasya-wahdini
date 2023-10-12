
package day4;

import java.util.Scanner;

public class Day4 {

    public static void main(String[] args) {
        //Deklarasi variabel
        String nama, alamat, jenisKelamin;
        int umur, kelas; 
        
        
        //Membuat Scanner baru
        Scanner mhs = new Scanner(System.in);
        
        //Menampilkan output
        System.out.println("Data mahasiswa unsulbar");
        System.out.print("Masukkan nama Mahasiswa: ");
        nama = mhs.nextLine();
        
        System.out.print("Masukkan alamat: ");
        alamat = mhs.nextLine();
        
        System.out.print("Masukkan jenis kelamin: ");
        jenisKelamin = mhs.nextLine();
        
        System.out.print("Masukkan umur: ");
        umur = mhs.nextInt();
        
        System.out.print("Masukkan kelas: ");
        kelas = mhs.nextInt();
        
        //Menampilkan apa yang sudah disimpan di variabel
        System.out.println("------------------------");
        System.out.println("Tampilan data yang telah di input");
        System.out.println("Nama mahasiswa: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Kelas: " + kelas );
    }
    
}
