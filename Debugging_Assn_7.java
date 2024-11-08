import java.util.Scanner;

public class Debugging_Assn_7 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); //open for keyboard input
        System.out.print("Enter an integer: ");

        try {
            double number = kb.nextDouble();
            System.out.print("Enter another integer:");
            double number2 = kb.nextDouble();
            try{
            double number3=number/number2;
            if (number3 == Double.POSITIVE_INFINITY){
              throw new ArithmeticException();
            }
            System.out.print("Your answer is : " + number3);
            
           } catch(ArithmeticException ae){
              
            System.out.println("invalid input");
            }
        } catch (Exception e) {
           System.out.println("Invalid input. Please enter a valid integer.");
        } 
        kb.close();
    }
}
