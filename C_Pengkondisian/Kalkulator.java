package C_Pengkondisian;


    import java.util.Scanner;
import java.util.Locale;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US); // Agar aman membaca input desimal dengan titik (.)

        // Menerima input dari pengguna
        System.out.print("Masukkan bilangan pertama : ");
        double bil1 = input.nextDouble();

        System.out.print("Masukkan operator (+ - * / %): ");
        char operator = input.next().charAt(0); // Mengambil karakter pertama dari input operator

        System.out.print("Masukkan bilangan kedua   : ");
        double bil2 = input.nextDouble();

        double hasil = 0;
        boolean statusValid = true; // Penanda apakah operasi berhasil dilakukan

        // Menggunakan switch untuk menentukan jenis operasi matematika
        switch (operator) {
            case '+':
                hasil = bil1 + bil2;
                break;
            case '-':
                hasil = bil1 - bil2;
                break;
            case '*':
                hasil = bil1 * bil2;
                break;
            case '/':
                // Menggunakan if di dalam case untuk mencegah pembagian dengan nol
                if (bil2 == 0) {
                    System.out.println("Tidak bisa membagi dengan nol");
                    statusValid = false;
                } else {
                    hasil = bil1 / bil2;
                }
                break;
            case '%':
                // Menggunakan if di dalam case untuk mencegah modulus dengan nol
                if (bil2 == 0) {
                    System.out.println("Tidak bisa membagi dengan nol");
                    statusValid = false;
                } else {
                    hasil = bil1 % bil2;
                }
                break;
            default:
                System.out.println("Operator tidak valid");
                statusValid = false;
                break;
        }

        // Tampilkan hasil hanya jika operasi valid
        if (statusValid) {
            System.out.println("Hasil: " + bil1 + " " + operator + " " + bil2 + " = " + hasil);
        }

        input.close();
    }
}
    
