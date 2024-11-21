import java.lang.Math;

class Table_Of_Values {
    public static void main(String[] args) {
     
        System.out.printf("%-5s %-10s %-10s %-10s\n", "x", "sqrt(x)", "x^2", "x^3");
       
       
        for (int x = 0; x <= 10; x++) {
            double sqr = Math.sqrt(x);
            double sqre = Math.pow(x, 2);
            double cbe = Math.pow(x, 3);
           
     
            System.out.printf("%-5d %-10.4f %-10.4f %-10.4f\n", x, sqr, sqre, cbe);
        }
    }
}
