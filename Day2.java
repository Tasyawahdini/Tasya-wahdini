package day2;

public class Day2 {

    public static void main(String[] args) {
        //Tipe data primitif tidak memiliki objek, hanya memiliki nilai
        //Tipe data non primitif adalah tipe data yang merupakan objek. 
        
        //Tipe data primitif
        int harga = 20000; //int merupakan tipe data primitif yang digunakan untuk menyimpan nilai harga dalam bentuk bilangan bulat
        double beratBarang = 70.12; //double merupakan tipe data primitif yang digunakan untuk menyimpan berat barang dalam bentuk bilangan pecahan
        char karakter = 'A'; //char merupakan tipe data primitif yang digunakan untuk menyimpan karakter
        boolean pesan = true; //boolean merupakan tipe data primitif yang digunakan sebagai nilai benar atau salah (true and false)
        
        //Menampilkan informasi tipe data primitif
        System.out.println("Tipe data primitif");
        System.out.println("Harga barang adalah: " + harga);
        System.out.println("Berat barang adalah: " + beratBarang);
        System.out.println("Karakter: " + karakter);
        System.out.println("Status pemesanan anda: " + pesan);
        System.out.println("-------------------------------------");
        
        //Tipe data non primitif (Objek) String
        String nama = "Tasya wahdini"; //Membuat objek string dengan nilai "Tasya wahdini" yang disimpan dalam variabel nama
        int panjangNama = nama.length(); //Menggunakan metode pada objek string untuk mendapatkan panjang string
        String upperNama = nama.toUpperCase(); //menggunakan metode pada objek string untuk mengonversi string ke huruf kapital (uppercase)
        
        //Menampilkan hasil
        System.out.println("Non primitif tipe data string");
        System.out.println("Nama: " + nama);
        System.out.println("Panjang nama: " + panjangNama);
        System.out.println("Nama Uppercase: " + upperNama);
        System.out.println("-------------------------------");
        
        //Tipe data non primitif (Objek) Array
        int[] angka = {1, 2, 3, 4, 5}; //Membuat variabel angka dengan tipe data array integer (int[]) dan menginisialisasinya dengan array integer yang berisi 5 angka.
        
        // Menampilkan elemen-elemen array
        System.out.println("Non primitif tipe data array");
        System.out.print("Elemen-elemen dalam array: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
    }
}
