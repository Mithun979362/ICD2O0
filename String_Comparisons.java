public class String_Comparisons {
    public static void main(String[] args) {
        String w1 = "fortify";
        String w2 = "shellac";
        String w3 = "shellshock";

        String first, next, last;

        if (w1.compareTo(w2) < 0) {
            if (w1.compareTo(w3) < 0) {
                first = w1;
                if (w2.compareTo(w3) < 0) {
                    next = w2;
                    last = w3;
                } else {
                    next = w3;
                    last = w2;
                }
            } else {
                first = w3;
                next = w1;
                last = w2;
            }
        } else {
            if (w2.compareTo(w3) < 0) {
                first = w2;
                if (w1.compareTo(w3) < 0) {
                    next = w1;
                    last = w3;
                } else {
                    next = w3;
                    last = w1;
                }
            } else {
                first = w3;
                next = w2;
                last = w1;
            }
        }
        
        System.out.println("The first word is: " + first);
        System.out.println("The next word is: " + next);
        System.out.println("The last word is: " + last);
    }
}
