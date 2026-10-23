package B_TipeDataOperator;

public class KonversiTipe {
    public static void main(String[] args) {
        // Widening casting (otomatis): tipe kecil ke tipe besar
        int angkaInt = 9;
        double angkaDouble = angkaInt;
        System.out.println("int ke double   : " + angkaDouble);
 
        // Narrowing casting (manual): tipe besar ke tipe kecil
        double nilai = 9.78;
        int nilaiBulat = (int) nilai;
        System.out.println("double ke int   : " + nilaiBulat);
 
        // Pembagian integer vs pembagian desimal
        int a = 7, b = 2;
        System.out.println("7 / 2 (int)     : " + (a / b));
        System.out.println("7 / 2 (double)  : " + ((double) a / b));
    }

    
}
