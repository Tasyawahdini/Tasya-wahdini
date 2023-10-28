package day21;
import java.util.Scanner;
public class Day21 {

    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        int beli = 0;
        
        System.out.print("Total beli : Rp. ");
        beli = xyz.nextInt();
        
        if ( beli > 200000){
            System.out.println("Selamat anda mendapat diskon/potongan harga");
        }
        System.out.println("Terima kasih sudah berbelanja disini");
    }
    
    
}
