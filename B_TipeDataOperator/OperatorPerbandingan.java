package B_TipeDataOperator;

public class OperatorPerbandingan {
    public static void main(String[] args) {
        int x = 20;
        int y = 18;
 
        // Operator perbandingan menghasilkan nilai boolean
        System.out.println("x == y : " + (x == y));
        System.out.println("x != y : " + (x != y));
        System.out.println("x >  y : " + (x > y));
        System.out.println("x <  y : " + (x < y));
        System.out.println("x >= y : " + (x >= y));
        System.out.println("x <= y : " + (x <= y));
 
        // Operator logika
        boolean hasil1 = (x > 10) && (y > 10);
        boolean hasil2 = (x > 25) || (y > 10);
        boolean hasil3 = !(x > y);
        System.out.println("(x > 10) && (y > 10) : " + hasil1);
        System.out.println("(x > 25) || (y > 10) : " + hasil2);
        System.out.println("!(x > y)             : " + hasil3);
    }

    
}
