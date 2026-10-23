package B_TipeDataOperator;

import java.util.Scanner;

public class LuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang : ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar : ");
        double lebar = input.nextDouble();

        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        System.out.println("Luas     = " + luas);
        System.out.println("Keliling = " + keliling);

        input.close();
    }
}