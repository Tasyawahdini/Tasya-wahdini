package day23;

import java.util.Scanner;

public class Day23 {

    public static void main(String[] args) {
       Scanner caca = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka : ");
        int angka = caca.nextInt();
        
        String jawaban = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka " + angka + " adalah bilangan " + jawaban);

    }
    
}
