package C_Pengkondisian;

import java.util.Scanner;

public class NilaiHuruf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai akhir (0-100): ");
        int nilai = input.nextInt();
        String huruf;
 
        if (nilai < 0 || nilai > 100) {
            huruf = "Nilai tidak valid";
        } else if (nilai >= 80) {
            huruf = "A";
        } else if (nilai >= 70) {
            huruf = "B";
        } else if (nilai >= 60) {
            huruf = "C";
        } else if (nilai >= 50) {
            huruf = "D";
        } else {
            huruf = "E";
        }
 
        System.out.println("Nilai huruf: " + huruf);
        input.close();
    }

    
}
