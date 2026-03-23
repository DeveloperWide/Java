package Day_6;

public class Binary {

    public static int binToDec(int n) {
        int dec = 0;
        int pow = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            dec += lastDigit * Math.pow(2, pow);

            pow++;
            n /= 10;
        }

        return dec;
    }

    public static int DecToBin(int n) {
        int bin = 0;
        int pow = 0; // 1 , 2, 3, 4

        // 10
        while (n > 0) {
            int remainder = n % 2; // 0
            bin = bin + (remainder * (int) Math.pow(10, pow));

            pow++;
            n /= 2; // 0
        }

        return bin;
    }

    public static void main(String[] args) {
        System.out.println(DecToBin(4));
    }
}
