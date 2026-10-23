package B_TipeDataOperator;

public class OperatorAritmatika {
    public static void main(String[] args) {
        int a = 17;
        int b = 5;
 
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
 
        // Operator increment dan decrement
        int x = 10;
        x++;
        System.out.println("x setelah x++ : " + x);
        x--;
        System.out.println("x setelah x-- : " + x);
 
        // Operator penugasan (assignment)
        int y = 10;
        y += 5;
        System.out.println("y += 5  -> " + y);
        y *= 2;
        System.out.println("y *= 2  -> " + y);
        y %= 7;
        System.out.println("y %= 7  -> " + y);
    }

    
}
