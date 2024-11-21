import java.util.Scanner;

public class Emoji {
    public static void main(String[] args) {
        // Your code starts here!
        long smiley = 0x1F600; 
        int count = 0; 
        
        for (smiley = 0x1F600; smiley <= 0x1F64F; smiley++) {
            String uChar = new String(Character.toChars((int) smiley));
            System.out.printf("%4h\t%s", smiley, uChar);
            count++;

           
            if (count % 8 == 0) {
                System.out.println(); 
            } else {
                System.out.print("\t"); 
            }
        }

       
        if (count % 8 != 0) {
            System.out.println();
        }
        // Your code stops here!
    }
}
