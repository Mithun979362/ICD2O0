
package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {
    /*
Mithun Kumar Arunkumar 979362
Date: 12 December,2024
Course: Grade 10 Com Sci
Title: Rock paper scissors
Description: A program which plays a game of rock paper scissors
    VARIABLE DICTIONARY: 
pscore (int)player score
cscore (int) computer score
tiescore (int) number of ties
totalround(int) total number of rounds players want to play
num(string) User choice for rock paper or scissors
numr(char) Char version of user choice for rock paper or scissors
comp(int)Computer choice for rock paper or scissors
compthing(char) Char version of computer choice for rock paper or scissors
    */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);//declares scanner
        int pscore = 0; // Player score variable
        int cscore = 0; // Computer score variable
        int tiescore=0;//ties variable
        
        System.out.println("How many rounds of rock paper scissors do you want to play?");//prints
        int totalround = kb.nextInt();//declares variable as user input
        kb.nextLine(); // Consume the new line character after nextInt()

        while (totalround > 0) {//creates while loop that runs until totalround is greater than 0
            System.out.println("Enter R for rock, P for paper, or S for scissors");//prints
            String num = kb.nextLine().toUpperCase(); // Convert input to uppercase
            char numr = num.charAt(0);//make input a char
            
            
            int comp = (int) (3 * Math.random());//generates computer choice
            char compthing;//declares compthing as char
            if (comp == 0) {//if statement that runs if comp is equal to 0
                compthing = 'R'; //declare compthing as R
            } else if (comp == 1) {//else if that runs if comp is equal to 1
                compthing = 'P';//declares compthing as P
            } else {//runs if comp is equal to 2
                compthing = 'S';//deckares compthing as S
            }

            
            System.out.println("Computer chose: " + compthing);//displays computers choice

            // Determine the outcome
            if (numr == compthing) {//runs if computer and user chooses same
                System.out.println("It is a draw");//prints
                tiescore++;//adds one to tie score
            } else if ((numr == 'R' && compthing == 'S') ||//runs if player wins
                       (numr == 'P' && compthing == 'R') ||
                       (numr == 'S' && compthing == 'P')) {
                System.out.println("The player wins");//prints
                pscore++;//adds one to player score
            } else {//runs if computer wins
                System.out.println("The computer wins");//prints
                cscore++;//adds one to computer score
            }

            totalround--; // subtracts one from the number of rounds
        }

        // Final results
        System.out.println("Final Results:");//prints
        System.out.println("Computer Score: " + cscore);//prints
        System.out.println("Player Score: " + pscore);//prints
        System.out.println("Ties: "+tiescore);//prints

        if (cscore > pscore) {//runs if computer won more than player
            System.out.println("The computer wins ");//prints
        } else if (cscore == pscore) {//runs if it is a draw
            System.out.println("It's a draw ");//prints
        } else {//runs if player wins
            System.out.println("The player wins ");//prints
        }
        
        kb.close(); // Close the scanner
    }
}
