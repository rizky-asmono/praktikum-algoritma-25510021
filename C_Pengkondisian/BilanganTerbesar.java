package C_Pengkondisian;


    import java.util.Scanner;

public class BilanganTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan 1: ");
        int bil1 = input.nextInt();

        System.out.print("Masukkan bilangan 2: ");
        int bil2 = input.nextInt();

        System.out.print("Masukkan bilangan 3: ");
        int bil3 = input.nextInt();

        int terbesar;

        if (bil1 >= bil2 && bil1 >= bil3) {
            terbesar = bil1;
        } else if (bil2 >= bil1 && bil2 >= bil3) {
            terbesar = bil2;
        } else {
            terbesar = bil3;
        }

    
        System.out.println("Bilangan terbesar adalah " + terbesar);
        input.close();
    }
}
    

