import java.util.Scanner;

public class Calculate_Factorials {
    public static void main(String[] args) {
        // Your code goes here!
        Scanner kb = new Scanner(System.in);
        System.out.println("What number do you want to factorial?");
        int n = kb.nextInt();
        int fac = 1;

        while (n >= 1) {
            fac = fac * n;
            n = n - 1;
        } 

        System.out.println("Your answer is " + fac + ".");
        // Your code stops here!
    }
}
