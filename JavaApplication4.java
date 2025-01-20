package javaapplication4; // Define the package for the application

import java.io.File; // Import file handling classes
import java.util.Scanner; // Import Scanner for reading input

public class JavaApplication4 { // Define the main class
   /*
Mithun Kumar Arunkumar 979362
Date: 20 December,2025
Course: Grade 10 Com Sci
Title: Credit Card Assignment 
Description: Computes the balances on credit cards on a file
VARIABLE DICTIONARY: 
totbal (double) total balance of the account
highbal (double) Highest balance of the accounts
lowbal (double) Lowest balance of the accounts
highacc(string) Account number with high balance
lowacc(string) Account number with low balance
cuscount(int) Number of customers/accounts
accnum(String)stores the current account number
sbal(double) reads starting balance
recpur(double)read recorded purchase
recpay(double) read recorded payments
finbal(double) final balance
avbal(double)average balance 
*/

    // Method to calculate the final balance based on old balance, purchase, and payment
    static double calculateFinalBalance(double oldBal, double purchase, double payment) {
        return oldBal + purchase - payment; // Return the calculated final balance
    }

    public static void main(String[] args) { // Main method where execution starts
        // Specify the path to the data file
        String fileName = "C:\\Users\\979362\\Documents\\NetBeansProjects\\JavaApplication4\\src\\javaapplication4\\ledger.dat"; 
        
        // Initialize variables to track total balance, highest and lowest balances, and account count
        double totbal = 0; 
        double highbal = 0; 
        double lowbal = Double.MAX_VALUE; // Set low balance to maximum value initially
        String highacc = ""; // To store account number with highest balance
        String lowacc = ""; // To store account number with lowest balance
        int cuscount = 0; // Counter for the number of customers/accounts

        // Try block to handle file reading and processing
        try {
            Scanner kb = new Scanner(new File(fileName)); // Create a Scanner to read the file

            // Loop through each line in the file
            while (kb.hasNextLine()) {
                String line = kb.nextLine(); // Read the next line from the file

                // Create a new Scanner to parse the line
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter("\\s+"); // Use whitespace as the delimiter

                // Read the values directly from the line
                String accnum = lineScanner.next(); // Read account number
                double sbal = lineScanner.nextDouble(); // Read starting balance
                double recpur = lineScanner.nextDouble(); // Read recorded purchases
                double recpay = lineScanner.nextDouble(); // Read recorded payments

                // Calculate the final balance using the method defined above
                double finbal = calculateFinalBalance(sbal, recpur, recpay);
                cuscount++; // Increment the customer count

                // Print the account number and final balance
                System.out.printf("Account: %s, Final Balance: %.2f%n", accnum, finbal);
                totbal += finbal; // Add the final balance to the total balance

                // Check if the current final balance is higher than the recorded highest balance
                if (finbal > highbal) {
                    highbal = finbal; // Update highest balance
                    highacc = accnum; // Update account number for highest balance
                }
                
                // Check if the current final balance is lower than the recorded lowest balance
                if (finbal < lowbal) {
                    lowbal = finbal; // Update lowest balance
                    lowacc = accnum; // Update account number for lowest balance
                }

                lineScanner.close(); // Close the line scanner to free resources
            }
            kb.close(); // Close the file scanner to free resources
        } catch (Exception e) { // Catch any exceptions that occur during file reading
            System.out.println("Error: " + e.getMessage()); // Print the error message
        }

        // Calculate the average balance, ensuring no division by zero
        double avbal = cuscount > 0 ? totbal / cuscount : 0; 

        // Print the highest and lowest balances if any accounts were processed
        if (cuscount > 0) {
            System.out.printf("\nHighest Balance: %s, Amount: %.2f%n", highacc, highbal);
            System.out.printf("Lowest Balance: %s, Amount: %.2f%n", lowacc, lowbal);
        } else {
            System.out.println("No valid balances found."); // Message if no accounts were processed
        }

        // Print the average balance
        System.out.printf("Average Balance: %.2f%n", avbal);
    }
}
