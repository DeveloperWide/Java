import java.util.*;

public class isPrime{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.print("Write any Num : ");
      int n = sc.nextInt();

      if(n <= 1){
        System.out.println(n + " is NOT a Prime Number.");
        return;
      }

      boolean isPrime = true;

      for(int i=2; i<=Math.sqrt(n); i++){ // n = 1000
         if(n % i == 0){
          isPrime = false;
          break;
        }
      }

      String printIsPrime = isPrime ? n + " is a Prime Number." : n + " is NOT a Prime Number.";
      System.out.println(printIsPrime);
    }
}