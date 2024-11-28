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
                System.out.print("; " + String.format("%,d", currentValue)); 
                totalNum++;
                if (currentValue > maxValue) {
                    maxValue = currentValue;
                }
            }

            System.out.println();
            System.out.println("The number of terms = " + String.format("%,d", totalNum)); 
            System.out.println("The highest value reached = " + String.format("%,d", maxValue)); 
            System.out.print("Do another? (y/n): ");
            redo = kb.next(); 
        }

        kb.close();
    }
}
