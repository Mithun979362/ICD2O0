/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author 979362
 */ import java.util.Scanner;
public class assignment2 {
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);//declaring the scanner
        String Redo = "y";
        int maxnum=0;
        int totalnum=0;
     while (Redo=="y"){
         System.out.println("Enter a whole number");
         int c = kb.nextInt();
         int c1=c;
     while (c>=2){
     if (c%2==0){
         c=c/2;
         totalnum=totalnum+1;
     }else if (c%2!=0){
         c=c*3/2;
         totalnum=totalnum+1;
     } 
     }
               
               
      System.out.println("The Collatz sequence for n = " + c1 + " is: " + c);     
      System.out.println("Number of terms ="+c);
    }
     System.out.println("Do another? (y/n)");
      Redo=kb.nextLine();
    
}
}
