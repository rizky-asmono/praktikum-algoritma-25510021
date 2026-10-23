package C_Pengkondisian;


    import java.util.Scanner;
import java.util.Locale;

public class HitungBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US); 
        
        System.out.print("Masukkan berat badan (kg) : ");
        double berat = input.nextDouble();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiCm = input.nextDouble();

        double tinggiMeter = tinggiCm / 100.0;
        double bmi = berat / (tinggiMeter * tinggiMeter);

        String kategori;
        if (bmi < 18.5) {
            kategori = "Berat badan kurang";
        } else if (bmi < 25.0) {
            kategori = "Normal";
        } else if (bmi < 30.0) {
            kategori = "Berat badan berlebih";
        } else {
            kategori = "Obesitas";
        }

        System.out.println("BMI Anda    : " + bmi);
        System.out.println("Kategori    : " + kategori);

        input.close();
    }
}
    
