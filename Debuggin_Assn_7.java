import java.util.Scanner;

public class Debuggin_Assn_7 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); //open for keyboard input
        System.out.print("Enter an integer: ");
        try {
            double a = kb.nextDouble();
            System.out.print("Enter another integer");
            double b = kb.nextDouble();
            double ab = a/b;
            System.out.println("Your integers divided by each other is: " + ab);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
       
        }
         
        kb.close();
    }
}
