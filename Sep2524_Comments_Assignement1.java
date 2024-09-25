/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sep2524_Comments_Assignement1;
import java.util.Scanner;
import java.lang.Math.*;
/**
 *
 * @author 979362
 */
public class Sep2524_Comments_Assignement1 {
    /* Variable dictionary
    Lengthrec-Length of rectangle
    Widthrec-Width of rectangle
    arearec-Area of rectangle
    rad=radius of circle
    radsquare=radius of circle squared
    ac=area of circle
    radcyl=radius of cylinder
    heightcyl=height of cylinder
    radcylsquare=radius of cylinder squared
    piradcylsquare= radius of cylinder squared times Pi
    heightpiradcylsquare=radius of cylinder squared times pi times the height of the cylinder
    piradcylheight= two times pi times the radius and height of the cylinder
    piradcylsquaretwo= the radius of the cylinder squared time pi times 2
    sacyl=The surface area of the cylinder
    dist=The distance the pendulum travels in meters
    twopi=Pi times two
    grav=Gravitational effect(9.8g)
    distovergrav=distance in meters divided by the grav effect in g 
    sqrt=square root of distance in meters divide by the grav effect
    p=the time the pendulum takes to swing a distance in seconds
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);//declaring the scanner 
        System.out.println("This program will compute:\narea of a rectangle ");//prints This program will compute, goes to the next line,and then prints area of a rectangle
        System.out.println("area of a circle");//prints area of a circle
        System.out.println("Surface area and volume of a sphere");//prints surface area and volume of a sphere
        System.out.println("And how long a pendulum will take to swing");//prints how long a pendulum will take to swing
        System.out.println("First, I am going to calculate the area of a rectangle");//Prints, I am going to calculate the area of a rectangel
        System.out.print("Enter The length of the rectangle in meters");//prints to tell the user to enter the length of a rectangle in meters
        float Lengthrec = scanner.nextInt();//takes the input of the user as a variable
        System.out.print("Enter the width of the rectangle in meters");//prints to tell the user to enter the width of a rectangle in meters
        float Widthrec = scanner.nextInt();//takes the input of the user as a variable
        float arearec=(Widthrec*Lengthrec);//multiplies the two to get the area and make it as a variable
        System.out.print("The area of the rectangle is ");
        System.out.printf("%.2f", arearec);
        System.out.println("\nNow, I am going to calculate the area of a circle");
        System.out.print("Enter the radius of the circle"); 
        float rad = scanner.nextInt();
        float radsquare = rad*rad;
        float ac= (float) (radsquare* Math.PI);
        System.out.print("The area of the circle is");
        System.out.printf("%.2f", ac);
        System.out.println("\nNow, I am going to calculate the Volume and the surface area of a cylinder");
        System.out.print("Enter the radius of the cylinder");
        float radcyl = scanner.nextInt();
        System.out.print("Enter the height of the cylinder");
        float heightcyl = scanner.nextInt();
        float radcylsquare= (radcyl*radcyl);
        float piradcylsquare=(float) (radcylsquare*Math.PI);
        float heightpiradcylsquare=(piradcylsquare*heightcyl);
        System.out.print("The volume of the cylinder is ");
        System.out.printf("%.2f", heightpiradcylsquare);
        float piradcylheight=(float) (2*Math.PI*radcyl*heightcyl);
        float piradcylsquaretwo= (piradcylsquare*2);
        float sacyl=(piradcylsquaretwo+piradcylheight);
        System.out.print("\nThe Surface area of the cylinder is ");
        System.out.printf("%.2f", sacyl);
        System.out.println("\nNow, I am going to calculate the time it takes for a pendulum to swing a distance ");
        System.out.print("Enter the distance the pendulum travels in meters");
        float dist = scanner.nextInt();
        float twopi=(float) (Math.PI*2);
        float grav=(float) 9.8;
        float distovergrav=(dist/grav);
        float sqrt=(float) (Math.sqrt(distovergrav));   
        float p=(twopi*sqrt);
        System.out.print("The time the pendulum takes to swing your distance in seconds is"+ " ");
        System.out.printf("%.2f", p);
        System.out.print("\nThanks for using my calculator");
    }
    
}
