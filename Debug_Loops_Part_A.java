import java.lang.Math;

// Fix the errors in the code below to find the first 12
// numbers and their square roots to 4 decimals.

class Debug_Loops_Part_A {
    public static void main(String [] args) {
        for (int x = 1; x < 13; x++) {
            double sr = Math.sqrt(x);
            System.out.printf("%d %.4f\n", x, sr);
        }
    }
}