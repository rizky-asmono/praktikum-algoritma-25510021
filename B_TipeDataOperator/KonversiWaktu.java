package B_TipeDataOperator;

import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah detik : ");
        int totalDetik = input.nextInt();

        // 1 Jam = 3600 detik (60 menit * 60 detik)
        int jam = totalDetik / 3600;
        
        // Sisa detik setelah diambil jamnya, kemudian dibagi 60 untuk mencari menit
        int sisaDetikSetelahJam = totalDetik % 3600;
        int menit = sisaDetikSetelahJam / 60;
        
        // Sisa detik terakhir setelah diambil jam dan menitnya
        int detik = sisaDetikSetelahJam % 60;

        System.out.println("\n--- Hasil Konversi Waktu ---");
        System.out.println(totalDetik + " detik setara dengan:");
        System.out.println(jam + " jam, " + menit + " menit, dan " + detik + " detik.");

        input.close();
    }
}
