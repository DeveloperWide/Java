package Day_6;

public class Scope {

    public static void printNumber() {
        int num = 10; // method scope
        System.out.println("Inside method: " + num);
    }

    public static void main(String[] args) {
        printNumber();

        if (true) {
            int x = 5; // block scope
            System.out.println("Inside block: " + x);
        }

    }
}