package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {
    
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
*/

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
