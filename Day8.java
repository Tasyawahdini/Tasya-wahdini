package day8;

import java.util.Scanner;

public class Day8 {

    public static void main(String[] args) {
        //Penyajian algoritma berikut adalah algoritma untuk kasus menonton film dimanan yang hanya bisa menonton film adalah orang yang berusia 17 tahun kebawah, jika usia lebih dari 17 tahun maka tidak boleh menonton film.
        int usia;
        Scanner nonton = new Scanner(System.in);
        
        System.out.print("Berapa umur anda : ");
        usia = nonton.nextInt();
        
        if (usia <= 17){
            System.out.println("Usia anda " + usia + " Silahkan menonton");
        } else {
            System.out.println("Usia anda melewati batas, anda tidak boleh menonton");
        }
    }
    
}
