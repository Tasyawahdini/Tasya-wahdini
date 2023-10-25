package day17;

import java.util.Scanner;

public class Day17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan: ");
        double bilangan = input.nextDouble();

        if (bilangan >= 10) {
            System.out.println("Bilangan tersebut adalah positif.");
        } else if (bilangan <= 10) {
            System.out.println("Bilangan tersebut adalah negatif.");
       
        }
    }
}






