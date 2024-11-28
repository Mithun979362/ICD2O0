package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String redo = "y";

        while (redo.equalsIgnoreCase("y")) {
            System.out.print("Enter a whole number: ");
           
            int initialValue = kb.nextInt();
            int currentValue = initialValue;
            int totalNum = 1;
            int maxValue = initialValue;

            System.out.print("The Collatz sequence for n = " + String.format("%,d", initialValue) + " is " + String.format("%,d", initialValue));

            while (currentValue != 1) {
                if (currentValue % 2 == 0) {
                    currentValue = currentValue / 2;
                } else {
                    currentValue = currentValue * 3 + 1;
                }
                System.out.print("; " + String.format("%,d", currentValue)); // Format current value
                totalNum++;
                if (currentValue > maxValue) {
                    maxValue = currentValue;
                }
            }

            System.out.println();
            System.out.println("The number of terms = " + String.format("%,d", totalNum)); // Format total number of terms
            System.out.println("The highest value reached = " + String.format("%,d", maxValue)); // Format max value
            System.out.print("Do another? (y/n): ");
            redo = kb.next(); // No need for nextLine() here
        }

        kb.close();
    }
}
