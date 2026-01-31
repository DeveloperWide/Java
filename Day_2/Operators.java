public class Operators {
    public static void main(String[] args){
        int A = 12;
        int B = 5;

        // Arithmetic Operators (Binary)
        int sum = A + B; // Addition
        int sub = A - B; // Substraction
        int multiply = A * B; //Multifiaction
        int divide = A / B; // Division
        int remainder = A % B; // Modulus(Remainder)

        // Arithmetic Operators (Unary)
        int c = A++; // Post Increment (Use -> Update)
        int d = ++B; // Pre Increment (Update -> Use)
        
        // Relational Operators (== , != , > , < , >= , <=)
        
        /* 
            System.out.println( 10 == 5 ); // Equal to  
            System.out.println( 10 != 5 ); // Not Equal to 
            System.out.println( 5 > 5 ); // Greater Than
            System.out.println( 10 < 5 ); // Less Than
            System.out.println( 5 >= 5 ); // Greater Than Equal to
            System.out.println( 10 <= 5 ); // Less Than Equal to
        */

        // Logical Operators (&& , || , !)
        // Example of (&&) Logical AND 
        
        boolean isLoggedIn = true;
        boolean isAdmin = false;

        boolean canAccessAdminPage = isLoggedIn && isAdmin;
        // System.out.println(canAccessAdminPage);
    
        // Example of (||) Logical OR
        boolean isProvider = false;
        boolean isGoodLooking = false;

        boolean isAccepted = isGoodLooking || isProvider;
        // System.out.println(isAccepted);


        // Assignment Operators
        int value = 20;
    /*
        // Addition
        value += 20;

        // Substraction
        value -= 20;

        // Multification
        value *= 20; 
    */

   int op = (3 + 4) * 5;
   System.out.println(op);

    }
}