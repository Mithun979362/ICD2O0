/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment1;
import java.util.Scanner;
import java.lang.Math.*;
/**
 *
 * @author 979362
 */
public class Sep2424_Unfinished {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in); 
        System.out.println("This program will compute area of a rectangle,area of the circle,surface area and volume of a sphere and how long a pendulum will take to swing");
        System.out.print("Enter The length of the rectangle");
        float Lengthrec = scanner.nextInt();
        System.out.print("Enter the width of the rectangle");
        float Widthrec = scanner.nextInt();
        System.out.print(Lengthrec*Widthrec);
        System.out.println("Enter the radius of the circle"); 
        float rad = scanner.nextInt();
        float radsquare = rad*rad;
        float radius= (float) (radsquare* Math.PI);
        System.out.println(radsquare);
        System.out.println("Enter the radius of the cylinder");
        float radcyl = scanner.nextInt();
        System.out.println("Enter the height of the cylinder");
        float heightcyl = scanner.nextInt();
        float radcylsquare= (radcyl*radcyl);
        float piradcylsquare=(int) (radcylsquare*Math.PI);
        float heightpiradcylsquare=(piradcylsquare*heightcyl);
        System.out.println("The volume of the cylinder is " + heightpiradcylsquare);
        float piradcylheight=(float) (2*Math.PI*radcyl*heightcyl);
        float piradcylsquaretwo= (piradcylsquare*2);
        System.out.println(piradcylsquaretwo+piradcylheight);
         
    }
    
}
