import java.util.*;

public class JavaBasics {
    public static void main(String args[]){
        byte value1 = 10;
        short value2 = value1;
        short sumOfValues = (short)(value1 + value2);
        System.out.println(sumOfValues);

        char character = 'b';
        int char_int = character;
        // System.out.println(char_int);



        Scanner sc = new Scanner(System.in);

        // String username = sc.next();
        // System.out.println("Username" + ": " + username + "@code");
        
        // Area Of Circle
        /* System.out.print("Radius of Circle : ");
        int r = sc.nextInt();

        float areaOfCircle = 3.14f * r * r; 
        // 452.16(float) -> 452

        System.out.println("Area of Circle : " + areaOfCircle); */

        // Sum of a & b
        /* int num1 = 10;
        int num2 = 5;  
        int sum = num1 + num2;  */

        // Primitive Datatypes - 8 (byte, int, short, long, float, double, char, boolean);

        byte a = 100; // (-128 to 127)
        short b = 200;
        int c = 199090;
        long d = 23449023l;

        // Decimal Number
        float price = 10.99f;
        double doublePrice = 59.9340599;

        boolean isAdult = false;
        char ch = 'a'; // Single Quote ('a', 'b', 'c');

        String name = "Mahesh";
    }
}