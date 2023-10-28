package day20;
import java.util.Scanner;
public class Day20 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int total = 0;
        
        System.out.println("Pilihan menu");
        System.out.println("1. Teh poci original    = Rp. 5.000");
        System.out.println("2. Teh poci rasa lemon  = Rp. 8.000");
        System.out.println("3. Teh poci rasa coklat = Rp. 8.000");
        System.out.println("4. Teh poci aneka rasa + toping = 10.000");
        System.out.println("-----------------------------------------------");
        
        System.out.print("Pilih menu yang tersedia berdasarkan nomor menu : ");
        int nomorMenu = inp.nextInt();
        
        System.out.print("Jumlah yang dibeli : ");
        int jumlah = inp.nextInt();
        System.out.println("----------------------------------------------");
        
        if (nomorMenu == 1){
            total = 5000 * jumlah; 
        } else if (nomorMenu == 2){
            total = 8000 * jumlah;
        } else if (nomorMenu == 3){
            total = 8000 * jumlah;
        } else if (nomorMenu == 4){
            total = 10000 * jumlah;
         }   
            System.out.println("Menu yang dipilih " + nomorMenu);
            System.out.println("Jumlah pesanan " + jumlah);
            System.out.println("--------------------------------------------");
            System.out.println("Total harga " + total);
    }
    
}
