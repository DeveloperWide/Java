public class whileLoop{
    public static void main(String[] args){
        int i = 1099; 
        int rev = 0;
        while(i > 0){ // Condition -> true -> false
            int lastdigit = i % 10; // get last digit  -> 0, 9, 8, 5, 3
            rev = (rev * 10) + lastdigit;
            i/=10; // Remove that last digit -> 3589 -> 358 -> 35 -> 3 -> 0
        }

        System.out.println(rev);
    }
}