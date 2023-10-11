package day3;

public class Day3 {

    public static void main(String[] args) {
        
        System.out.println("Konversi string ke tipe data primitif"); 
        //Konversi string ke int
        String strNilai = "23";
        int nilai = Integer.parseInt(strNilai);
        System.out.println("Hasil konversi dari Stirng ke Int adalah: " + nilai);
        
        //Konversi string ke byte
        String strAngka = "98";
        byte angka = Byte.parseByte(strAngka);
        System.out.println("Hasil konversi dari String ke Byte adalah: " + angka);
        System.out.println("-----------------------------------------------------");
        
        System.out.println("Konversi tipe data primitif ke sting");
        //Konversi boolean ke string
        boolean benar = true;
        String strBenar = Boolean.toString(benar);
        System.out.println("Hasil konversi dari boolean ke string adalah: " + strBenar);
        
        //Konversi char ke string
        char karakter = 'A';
        String strKarakter = Character.toString(karakter);
        System.out.println("Hasil konversi dari char ke string adalah: " + strKarakter);

    }
    
}
