package javaapplication4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class credit {

    public static void main(String[] args) {
        String file = "ledger.dat";
        int cuscount = 0;
        double totalBalance = 0;
        double lowbal = Double.MAX_VALUE; // Initialize to max value
        double highbal = Double.MIN_VALUE; // Initialize to min value
        String highbalanceacc = "";
        String lowbalanceacc = "";
        File ledgerdat = new File(file);

       

        try (Scanner fileScanner = new Scanner(ledgerdat)) {
            while (fileScanner.hasNextLine()) {
                String nexline = fileScanner.nextLine();
                try (Scanner lineScanner = new Scanner(nexline)) {
                    lineScanner.useDelimiter(",");
                    String accountNumber = lineScanner.next().trim();
                    double iniBalance = lineScanner.nextDouble();
                    double purchase = lineScanner.nextDouble();
                    double payment = lineScanner.nextDouble();

                    // Calculate final balance
                    double finbal = iniBalance - payment + purchase;
                    double finalBalance = finbal * (1 + 0.28 / 12); // Apply interest

                    // Update total balance
                    totalBalance += finalBalance;
                    cuscount++;

                    // Check for high and low balances
                    if (finalBalance > highbal) {
                        highbal = finalBalance;
                        highbalanceacc = accountNumber;
                    }
                    if (finalBalance < lowbal) {
                        lowbal = finalBalance;
                        lowbalanceacc = accountNumber;
                    }

                    System.out.printf("Account: %s | Final Balance: %.2f\n", accountNumber, finalBalance);
                } catch (Exception e) {
                    System.out.println("An error occurred while processing the line: " + e.getMessage());
                }
            }

            // Calculate and display summary after processing all accounts
            if (cuscount > 0) {
                double averageBalance = totalBalance / cuscount; // Calculate average balance
                System.out.printf("\nAverage Balance: %.2f\n", averageBalance); // Print average balance
                System.out.printf("Account with highest balance: %s | Final Balance: %.2f\n", highbalanceacc, highbal);
                System.out.printf("Account with lowest balance: %s | Final Balance: %.2f\n", lowbalanceacc, lowbal);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred while processing the file: " + e.getMessage());
        }
    }
}
