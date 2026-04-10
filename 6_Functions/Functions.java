package Day_6;

public class Functions {

    public static void printHello() {
        System.out.println("Hello World");
    }

    public static int sum(int a, int b) { // formal parameters or parameters
        a = 15;
        b = 20;

        int sum = a + b;
        return sum;
    }

    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        return f;
    }

    public static void binCoeff(int n, int r) {
        int factorial_n = factorial(n);
        int factorial_r = factorial(r);
        int factorial_nmr = factorial(n - r);

        int binCoeff = factorial_n / (factorial_r * factorial_nmr);

        System.out.println(binCoeff);
    }

    public static void main(String args[]) {
        binCoeff(10, 4);
    }
}
