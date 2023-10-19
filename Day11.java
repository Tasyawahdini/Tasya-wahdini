
package day11;

import java.util.Scanner;

public class Day11 {

    public static void main(String[] args) {
        
        Scanner menu = new Scanner(System.in);
        int totalHarga = 0;
        
        System.out.println("Menu yang tersedia");
        System.out.println("1. Nasi Geprek Sambal           : 13,000");
        System.out.println("2. Mie Goreng Kambing           : 17,000");
        System.out.println("3. Sate Ayam Bakar + es teh     : 20,000");
        System.out.println("4. Daging Rendang + Nasi        : 16,000");
        System.out.println("5. Pecel Lele Goreng + Nasi     : 17,000");
        System.out.println("--------------------------------------------");

        System.out.print("Masukkan angka sesuai dengan menu yang tersedia    : ");
        int nomorMenu = menu.nextInt();

        System.out.print("Jumlah beli  : ");
        int jumlahPesan = menu.nextInt();
        System.out.println("----------------------------");

        if (nomorMenu == 1) {
            totalHarga = 13000 * jumlahPesan;
        } else if (nomorMenu == 2) {
            totalHarga = 17000 * jumlahPesan;
        } else if (nomorMenu == 3) {
            totalHarga = 20000 * jumlahPesan;
        } else if (nomorMenu == 4) {
            totalHarga = 16000 * jumlahPesan;
        } else if (nomorMenu == 5) {
            totalHarga = 17000 * jumlahPesan;
        }

        System.out.println("Menu yang dipesan   : " + nomorMenu);
        System.out.println("Jumlah pesanan      : " + jumlahPesan);
        System.out.println("-------------------------------------");
        System.out.println("Total pembayaran    : " + totalHarga);

    }
    
}
