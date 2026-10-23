package C_Pengkondisian;

import java.util.Scanner;

public class TarifParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menerima input dari pengguna
        System.out.print("Jenis kendaraan (1=Motor, 2=Mobil): ");
        int jenis = input.nextInt();

        System.out.print("Lama parkir (jam): ");
        int lama = input.nextInt();

        // Validasi: Jika lama parkir kurang dari 1 atau jenis tidak valid (bukan 1 atau 2)
        if (lama < 1 || (jenis != 1 && jenis != 2)) {
            System.out.println("Pesan kesalahan: Jenis kendaraan tidak valid atau lama parkir kurang dari 1 jam.");
        } else {
            String namaJenis = "";
            int biaya = 0;

            if (jenis == 1) {
                namaJenis = "Motor";
                // Jam pertama Rp 2.000, jam berikutnya Rp 1.000 per jam
                biaya = 2000 + (lama - 1) * 1000;
                
                // Cek batas maksimal per hari (Rp 10.000)
                if (biaya > 10000) {
                    biaya = 10000;
                }
            } else if (jenis == 2) {
                namaJenis = "Mobil";
                // Jam pertama Rp 5.000, jam berikutnya Rp 3.000 per jam
                biaya = 5000 + (lama - 1) * 3000;
                
                // Cek batas maksimal per hari (Rp 30.000)
                if (biaya > 30000) {
                    biaya = 30000;
                }
            }

            // Menampilkan hasil sesuai format yang diharapkan
            System.out.println("Jenis      : " + namaJenis);
            System.out.println("Lama parkir: " + lama + " jam");
            System.out.println("Biaya      : Rp " + biaya);
        }

        input.close();
    }
}
