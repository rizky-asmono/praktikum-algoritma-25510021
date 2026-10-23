package C_Pengkondisian;

import java.util.Scanner;

public class MenuKantin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.println("===== MENU KANTIN =====");
        System.out.println("A. Nasi Goreng  - Rp 15000");
        System.out.println("B. Mie Ayam     - Rp 12000");
        System.out.println("C. Soto Ayam    - Rp 13000");
        System.out.print("Pilih menu (A/B/C): ");
        char pilihan = input.next().toUpperCase().charAt(0);
        System.out.print("Jumlah porsi     : ");
        int jumlah = input.nextInt();
 
        int harga = 0;
        String namaMenu = "";
        switch (pilihan) {
            case 'A':
                namaMenu = "Nasi Goreng";
                harga = 15000;
                break;
            case 'B':
                namaMenu = "Mie Ayam";
                harga = 12000;
                break;
            case 'C':
                namaMenu = "Soto Ayam";
                harga = 13000;
                break;
            default:
                System.out.println("Pilihan menu tidak tersedia!");
        }
 
        if (harga > 0) {
            int total = harga * jumlah;
            System.out.println("Pesanan : " + jumlah + " x " + namaMenu);
            System.out.println("Total   : Rp " + total);
        }
        input.close();
    }

}
