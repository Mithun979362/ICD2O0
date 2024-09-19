import java.util.Scanner;

public class Project_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
      
        System.out.println("Enter your year of birth:");
        int dob = scanner.nextInt();
        System.out.println("Enter your age:");
        int age = scanner.nextInt(); 
      
        int partone = (dob * 2 + 5);
        int parttwo = (partone * 50 + age);
        int partthree = (parttwo - 250);
        int partfour = (partthree / 100);
        System.out.println("The answer is " + partfour); 
    }
}
      
    
      
  
