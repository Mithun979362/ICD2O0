package javaapplication2;

import java.util.Scanner;

public class assignment2 {
    
/*
Mithun Kumar Arunkumar 979362
Date: 27 November,2024
Course: Grade 10 Com Sci
Title: Collatz Conjecture 
Description: A program which computes the collatz conjecture
VARIABLE DICTIONARY: 
c (int) The numbers that are being subject to the collatz conjecture
c1 (int) remembers the beginning number
c2 (int) Remembers the greatest number of the conjecture
redo(string) Saves the users input to run the code or not
*/package javaapplication2;

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

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); 
        String redo = "y"; 

        while (redo.equalsIgnoreCase("y")) { 
            System.out.println("Enter a whole number:");
            int c = kb.nextInt();
            int c1 = c; 
            int totalnum = 1; 
            int c2 = c;

            
            System.out.print("The Collatz sequence for n = " + c1 + " is: " + c1);

            while (c != 1) {
                if (c % 2 == 0) {
                    c = c / 2;
                } else {
                    c = c * 3 + 1; 
                }
                System.out.print(";" + c); 
                totalnum++; 
                if (c > c2) {
                    c2 = c; 
                }
            }

            System.out.println(); 
            System.out.println("The number of terms = " + totalnum);
            System.out.println("The highest value reached = " + c2);
            System.out.println("Do another? (y/n)");
            kb.nextLine(); 
            redo = kb.nextLine(); 
        }

        kb.close();
    }
}
