package day15;
import java.util.Scanner;
public class Day15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Isi data dibawah ini dengan benar");
        System.out.println("--------------------------------------");
        
        System.out.print("Masukkan nama anda    :   ");
        String nama = input.nextLine();
       
        System.out.print("Masukkan umur         :   ");
        int umur = input.nextInt();
        
        System.out.print("Masukkan berat badan  :   ");
        double beratBadan = input.nextDouble();
       
        System.out.print("Masukkan tinggi badan :   ");
        float tinggiBadan = input.nextFloat();
        System.out.println("----------------------------------------");
        
        System.out.println("Nama saya           : " + nama);
        System.out.println("Saya berusia        : " + umur);
        System.out.println("Berat badan saya    : " + beratBadan);
        System.out.println("Tinggi dadan saya   : " + tinggiBadan);
    }
    
}
