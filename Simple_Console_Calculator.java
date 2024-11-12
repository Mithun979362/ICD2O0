// any import statements go here!
import java.util.Scanner;

public class Simple_Console_Calculator {
    public static void main(String[] args) {
        // Your code goes here!
        Scanner kb = new Scanner(System.in); 
        System.out.println("Enter a number");
        double a = kb.nextDouble();
        System.out.println("Enter another Number");
        double b = kb.nextDouble();
        System.out.println("Enter an operator (+, -, *, or /)");
        String opS = kb.next();
        char op = opS.charAt(0);
        if (op == '+') {
          System.out.println(a + b);
        } else if (op=='-'){
          System.out.println(a-b);
        } else if (op=='*'){
          System.out.println(a*b);
        } else if (op=='/'){
          System.out.println(a/b);
        } 

         
         kb.close();
       // Yout code stops here!
    }
}
