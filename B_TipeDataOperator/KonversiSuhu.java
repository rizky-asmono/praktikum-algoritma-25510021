package B_TipeDataOperator;

import java.util.Locale;
import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US); // Supaya aman membaca input desimal dengan titik (.)

        System.out.print("Masukkan suhu dalam Celsius : ");
        double celsius = input.nextDouble();

        // PENTING: Gunakan 9.0 / 5.0 dan 4.0 / 5.0 (bukan 9/5 atau 4/5)
        // Agar Java melakukan pembagian desimal, bukan pembagian integer.
        double fahrenheit = (9.0 / 5.0 * celsius) + 32;
        double reamur = 4.0 / 5.0 * celsius;
        double kelvin = celsius + 273.15;

        System.out.println("\n--- Hasil Konversi Suhu ---");
        System.out.println("Celsius    : " + celsius + " °C");
        System.out.println("Fahrenheit : " + fahrenheit + " °F");
        System.out.println("Reamur     : " + reamur + " °R");
        System.out.println("Kelvin     : " + kelvin + " K");

        input.close();
    }
    
}
