package C_Pengkondisian;

public class ContohTernary {
    public static void main(String[] args) {
        int time = 20;
 
        // Versi if...else biasa
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
 
        // Versi ternary operator (satu baris)
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
 
        // Contoh lain: menentukan status kelulusan
        int nilai = 72;
        String status = (nilai >= 60) ? "LULUS" : "TIDAK LULUS";
        System.out.println("Nilai " + nilai + " -> " + status);
    }

    
}
