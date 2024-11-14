import java.util.Scanner;

class Determining a letter grade {
   public static void main(String [] args) {
   Scanner kb = new Scanner(System.in); 
   System.out.println("Input your mark as a whole number(0-100)");
   int a = kb.nextInt();
   if (a <= 49) {
            System.out.println(a+ " is a Letter grade of F.");
            System.out.println("Goodbye");
        } else if (a >= 50 && a <= 59) { 
            System.out.println(a + " is a Letter grade of D.");
            System.out.println("Goodbye");
        } else if (a >= 60 && a<=69) { 
            System.out.println(a+ " is a Letter grade of C.");
            System.out.println("Goodbye");
        } else if (a >= 70 && a <= 79) { 
            System.out.println(a+ " is a Letter grade of B.");
            System.out.println("Goodbye");
        } else if (a >= 80 && a<=100) { 
            System.out.println(a + " is a Letter grade of A.");
            System.out.println("Goodbye");
        } else if (a > 100) { 
            System.out.println("Invalid Input");
           
        }


      
   }
}
