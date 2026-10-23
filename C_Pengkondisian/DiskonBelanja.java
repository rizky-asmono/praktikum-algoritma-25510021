package C_Pengkondisian;


 import java.util.Scanner;
import java.util.Locale;

public class DiskonBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US); // Agar aman membaca input desimal dengan titik (.)

        // Menerima input dari pengguna
        System.out.print("Masukkan total belanja : ");
        double totalBelanja = input.nextDouble();

        System.out.print("Apakah member? (y/n)   : ");
        char statusMember = input.next().charAt(0);

        // 1. Menentukan persentase diskon belanja berdasarkan ketentuan
        double persentaseDiskon = 0;
        if (totalBelanja >= 500000) {
            persentaseDiskon = 0.15; // 15%
        } else if (totalBelanja >= 250000) {
            persentaseDiskon = 0.10; // 10%
        } else if (totalBelanja >= 100000) {
            persentaseDiskon = 0.05; // 5%
        } else {
            persentaseDiskon = 0.0;  // 0%
        }

        // Menghitung nominal diskon belanja
        double diskonBelanja = totalBelanja * persentaseDiskon;

        // 2. Menghitung diskon member menggunakan operator ternary (? :)
        // Jika statusMember 'y' atau 'Y', dapat 5% dari total belanja, jika tidak maka 0
        double diskonMember = (statusMember == 'y' || statusMember == 'Y') ? (totalBelanja * 0.05) : 0.0;

        // 3. Menghitung total yang harus dibayar
        double totalBayar = totalBelanja - diskonBelanja - diskonMember;

        // 4. Menampilkan hasil sesuai format
        System.out.println("Diskon belanja         : Rp " + diskonBelanja);
        System.out.println("Diskon member          : Rp " + diskonMember);
        System.out.println("Total bayar            : Rp " + totalBayar);

        input.close();
    }
}