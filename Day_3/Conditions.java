import java.util.*;

public class Conditions{
    public static void main(String[] args){
        // 1. if else Syntax
         int age = 18;

        /* if(age >= 18){
            System.out.println("Adult");
        }

        else{
            System.out.println("Not Adult");
        } */

        // 2. Largest of 2
        // int a = 19;
        // int b = 20;

        /* if(a > b){
            System.out.println( a + " is greater");
        } else {
            System.out.println(b + " is greater");
        } */

    //    3. Check if a number is Even or Odd

       Scanner sc = new Scanner(System.in);
       
       /* System.out.print("Write a Number : ");
       int number = sc.nextInt();

       if((number % 2) == 0){
        System.out.println("Even");
       }else{
        System.out.println("Odd");
       } */
      
    //   4. Multiple if conditions
     /*  if(true) {
        System.out.println("Print Something");
      }

      if(true) {
        System.out.println("Print Something");
      }

      else{
        System.out.print("Something Went Wrong");
      } */
      
      // 5. largest of 3 && else-if 
     /* int a = 70;
     int b = 40;
     int c = 30; */

     /* if( (a > b) && (a > c)){ 
        System.out.println("A is greater");
     }else if(b > c){
        System.out.println("B is greater");
     }else{
        System.out.println("C is greater");
     } */


    // 6. Ternary Operators
    int larger = (20 > 34) ? 20 : 34;
    // System.out.println(larger);

    String type = (20 % 2 == 0) ? "Even" : "Odd";
    // System.out.println(type);

    // 7. switch Statement
    System.out.print("Type Num a : ");
    int a = sc.nextInt();

    System.out.print("Type Num b : ");
    int b = sc.nextInt();

    System.out.print("Provide a Operator (-, + , * , / , %) : ");
    char operator = sc.next().charAt(0);

    switch(operator){
        case '+': 
            System.out.println(a + b);
            break;
        case '-': 
            System.out.println(a - b);
            break;
        case '*': 
            System.out.println(a * b);
            break;
        case '/': 
            System.out.println(a / b);
            break;
        case '%': 
            System.out.println(a % b);
            break;
        default: System.out.println("Enter a valid Operator");
    }
       
    }
}