package C_Pengkondisian;

public class SwitchDefault {
    public static void main(String[] args) {
        int day = 7;
        switch (day) {
            case 6:
                System.out.println("Hari ini hari Sabtu");
                break;
            case 7:
                System.out.println("Hari ini hari Minggu");
                break;
            default:
                System.out.println("Menunggu akhir pekan");
        }
    }
}


