
package day10;

import java.util.Scanner;

public class Day10 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int golongan;
        int lamaKerja;
   
        System.out.print("Masukkan golongan :");
        golongan = in.nextInt();
        System.out.print("Masukkan lama kerja (dalam tahun) :");
        lamaKerja = in.nextInt();
   
    int gaji = 0;
    switch (golongan) {
      case 1:
        gaji = 4000000;
        break;
      case 2:
        gaji = 7000000;
        break;
      case 3:
        gaji = 10000000;
        break;
      default:
        System.out.println("Golongan tidak valid");
        System.exit(1);
    }

    int bonus = 0;
    if (lamaKerja > 5) {
      bonus = 100000 * lamaKerja;
    }

    int total_gaji = gaji + bonus;

    System.out.println("Gaji karyawan adalah: Rp" + total_gaji);
  }
}
