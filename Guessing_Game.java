// any import statements go here!
import java.util.Scanner;
import java.util.Random;

public class Guessing_Game {
    public static void main(String[] args) {
        // Your code goes here!
    Scanner kb = new Scanner(System.in);
    Random random = new Random();
    int N = random.nextInt(10) + 1;
    System.out.println("Guess a number from 1 to 10");
    int a = kb.nextInt();
    int i = 1;
    while (a!=N && i!=5){
    i=i+1;
    System.out.println("Try again");
    a=kb.nextInt();
    } if (i>=5){
      System.out.println("You used up your attempts. The number was:"+N);
    }else if(i<=4){
      System.out.println("Good job guessing the number ");
    
    
      }  // Yout code stops here!
    }
}
