
package day9;

import java.util.Scanner;

public class Day9 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String nama,nim;
        int jurusan;
        
        System.out.print("Masukkan nama : ");
        nama = in.nextLine();
        System.out.print("Masukkan nim : ");
        nim = in.nextLine();
        System.out.print("Pilihan : \n 1. Teknik Informatika \n 2. Teknik Sipil \n 3. Pwk \n\n Masukkan pilihan : ");
        jurusan = in.nextInt();
        switch (jurusan){
            case 1:
                System.out.println("\n" + nama + " dengan nim " + nim + " Memilih jurusan Teknik Informatika");
                break;
            case 2: 
                System.out.println("\n" + nama + " dengan nim " + nim + " Memilih jurusan Teknik Sipil");
                break;
            case 3:
                System.out.println("\n" + nama + " dengan nim " + nim + "Memilih jurusan Pwk");
                break;
            
        }
    }
    
}
