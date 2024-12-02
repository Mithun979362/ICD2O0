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
        Scanner kb = new Scanner(System.in);//declares scanner
        String redo = "y";//declares redo as y

        while (redo.equalsIgnoreCase("y")) {
            System.out.print("Enter a whole number: ");//prints 
           
            int initialValue = kb.nextInt();//declares initialvalues as user input
            int currentValue = initialValue;//declares current value as initial value
            int totalNum = 1;//declares totalnum to 1
            int maxValue = initialValue;//declares max value as initial value

            System.out.print("The Collatz sequence for n = " + String.format("%,d", initialValue) + " is " + String.format("%,d", initialValue));//prints and formats to thousand seperators

            while (currentValue != 1) {//creats a while loop that runs while the current value is not 1
                if (currentValue % 2 == 0) {//creats an if statement to run if the number is even
                    currentValue = currentValue / 2;//divides that current value by 2
                } else {//runs if number is odd
                    currentValue = currentValue * 3 + 1;//multiplies number by 3 and adds 1
                }
                System.out.print("; " + String.format("%,d", currentValue)); //prints the current value with a thousand seperator
                totalNum++;//adds 1 to the totalnumber
                if (currentValue > maxValue) {//runs if the current is higher than the max
                    maxValue = currentValue;//makes mak value equal to current value
                }
            }

            System.out.println();
            System.out.println("The number of terms = " + String.format("%,d", totalNum)); //prints the number of terms
            System.out.println("The highest value reached = " + String.format("%,d", maxValue)); //prints the max value
            System.out.print("Do another? (y/n): ");//asks the user if they wanted to go again
            redo = kb.next(); //declares redo as user input
        }

        kb.close();
    }
}
