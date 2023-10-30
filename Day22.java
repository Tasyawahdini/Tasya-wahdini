package day22;
import java.util.Scanner;
public class Day22 {

    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        double angka1;
        double angka2;
        double hasil;
        
        System.out.println("Operator aritmatika");
        
        System.out.println("Penjumlahan");
        System.out.print("Masukkan bilangan pertama     : ");
        angka1 = abc.nextDouble();
        
        System.out.print("Masukkan bilangan kedua       : ");
        angka2 = abc.nextDouble();
        
        hasil = angka1 + angka2;
        System.out.println("Hasil penjumlahan adalah    = " + hasil);
        System.out.println("--------------------------");
        
        System.out.println("Pengurangan");
        System.out.print("Masukkan bilangan pertama     : ");
        angka1 = abc.nextDouble();
        
        System.out.print("Masukkan bilangan kedua       : ");
        angka2 = abc.nextDouble();
        
        hasil = angka1 - angka2;
        System.out.println("Hasil pengurangan adalah    = " + hasil);
        System.out.println("--------------------------");
        
        System.out.println("Perkalian");
        System.out.print("Masukkan bilangan pertama     : ");
        angka1 = abc.nextDouble();
        
        System.out.print("Masukkan bilangan kedua       : ");
        angka2 = abc.nextDouble();
        
        hasil = angka1 * angka2;
        System.out.println("Hasil perkalian             = " + hasil);
        System.out.println("--------------------------");
        
        System.out.println("Pembagian");
        System.out.print("Masukkan bilangan pertama     : ");
        angka1 = abc.nextDouble();
        
        System.out.print("Masukkan bilangan kedua       : ");
        angka2 = abc.nextDouble();
        
        hasil = angka1 / angka2;
        System.out.println("Hasil pembagian             = " + hasil);
        System.out.println("----------------------------");
        
        System.out.println("Sisa bagi");
        System.out.print("Masukkan bilangan pertama     : ");
        angka1 = abc.nextDouble();
        
        System.out.print("Masukkan bilangan kedua       : ");
        angka2 = abc.nextDouble();
        
        hasil = angka1 % angka2;
        System.out.println("Hasil sisa bagi adalah      = " + hasil);
       
    }
    
}
