
package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int pscore = 0; // Player score
        int cscore = 0; // Computer score
        
        System.out.println("How many rounds of rock paper scissors do you want to play?");
        int totalround = kb.nextInt();
        kb.nextLine(); // Consume the new line character after nextInt()

        while (totalround > 0) {
            System.out.println("Enter R for rock, P for paper, or S for scissors");
            String num = kb.nextLine().toUpperCase(); // Convert input to uppercase
            char numr = num.charAt(0);
            
            // Generate computer choice
            int comp = (int) (3 * Math.random());
            char compthing;
            if (comp == 0) {
                compthing = 'R'; 
            } else if (comp == 1) {
                compthing = 'P';
            } else {
                compthing = 'S';
            }

            // Display the choices
            System.out.println("Computer chose: " + compthing);

            // Determine the outcome
            if (numr == compthing) {
                System.out.println("It is a draw");
            } else if ((numr == 'R' && compthing == 'S') ||
                       (numr == 'P' && compthing == 'R') ||
                       (numr == 'S' && compthing == 'P')) {
                System.out.println("The player wins");
                pscore++;
            } else {
                System.out.println("The computer wins");
                cscore++;
            }

            totalround--; // Decrement the number of rounds
        }

        // Final results
        System.out.println("Final Results:");
        System.out.println("Computer Score: " + cscore);
        System.out.println("Player Score: " + pscore);

        if (cscore > pscore) {
            System.out.println("The computer wins ");
        } else if (cscore == pscore) {
            System.out.println("It's a draw ");
        } else {
            System.out.println("The player wins ");
        }
        
        kb.close(); // Close the scanner to avoid resource leaks
    }
}
