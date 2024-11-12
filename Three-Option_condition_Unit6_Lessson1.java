import java.util.Scanner;

class Three-Option_condition_Unit6_Lessson1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); 
        System.out.println("Enter the chance of rain as a decimal");
        double a = kb.nextDouble();
        if (a < 0.07) {
            System.out.println("The weather will be dry.");
        } else if (a >= 0.07 && a < 0.6) { 
            System.out.println("There is a small chance of rain."); 
        } else if (a >= 0.6) { 
            System.out.println("The forecast is rain."); 
        }
        
        kb.close();
    }
}
