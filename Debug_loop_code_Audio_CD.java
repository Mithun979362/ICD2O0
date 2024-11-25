import java.util.Scanner;

class Debug_loop_code_Audio_CD {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int tracks = 0;
        double totalMinutes = 0.0;

        System.out.print("How many tracks? : ");
        tracks = Integer.parseInt(keyboard.nextLine()); 
        for (int i = 1; i <= tracks; i++) { 
            System.out.print("How many minutes for track " + i + " ? : ");
            double minutes = Double.parseDouble(keyboard.nextLine()); 
            totalMinutes += minutes; 
        } 

       
        System.out.println("total running time : " + totalMinutes);
    } 
} 
