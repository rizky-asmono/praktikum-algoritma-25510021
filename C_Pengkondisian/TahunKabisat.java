package C_Pengkondisian;

import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();
 
        // Kabisat jika habis dibagi 4 tetapi tidak habis dibagi 100,
        // atau habis dibagi 400
        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) {
                    System.out.println(tahun + " adalah tahun kabisat");
                } else {
                    System.out.println(tahun + " bukan tahun kabisat");
                }
            } else {
                System.out.println(tahun + " adalah tahun kabisat");
            }
        } else {
            System.out.println(tahun + " bukan tahun kabisat");
        }
        input.close();
    }

    
}
