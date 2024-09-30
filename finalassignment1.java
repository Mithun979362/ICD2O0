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
public class Assigment1 {
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
        //prints This program will compute, goes to the next line,and then prints area of a rectangle
        System.out.println("This program will compute:\narea of a rectangle ");
        System.out.println("area of a circle");//prints area of a circle
        //prints surface area and volume of a sphere
        System.out.println("Surface area and volume of a sphere");
        //prints "and how long a pendulum will take to swing
        System.out.println("And how long a pendulum will take to swing");
        //Prints, I am going to calculate the area of a rectangle
        System.out.println("First, I am going to calculate the area of a rectangle");
        //prints to tell the user to enter the length of a rectangle in meters
        System.out.print("Enter The length of the rectangle in meters: ");
        double Lengthrec = scanner.nextInt();//takes the input of the user as a variable
        //prints to tell the user to enter the width of a rectangle in meters
        System.out.print("Enter the width of the rectangle in meters: ");
        double Widthrec = scanner.nextInt();//takes the input of the user as a variable
        //multiplies the two to get the area and make it as a variable
        double arearec=(Widthrec*Lengthrec);
        //prints the area of the rectangle and leaves cursor on same line
        System.out.print("The area of the rectangle is: ");
        //print the area of the rectangle with 2 decimal places
        System.out.printf("%.2f", arearec);
        //goes to new line and prints and moves cursor to next line
        System.out.println("\nNow, I am going to calculate the area of a circle");
        System.out.print("Enter the radius of the circle:"); //prints and leaves cursor on line
        double rad = scanner.nextInt();//takes user input and saves it as a variable
        double radsquare = rad*rad;//squares the radius and saves it as a variable
        //Multiplies the radius squared times PI and saves it as a variable
        double ac= (double) (radsquare* Math.PI);
        System.out.print("The area of the circle is:");//prints and leaves cursor on same line
        System.out.printf("%.2f", ac);//prints the area of the circle to 2 decimals
        //moves to a new line,prints ,and moves cursor to next line
        System.out.println("\nNow, I am going to calculate the Volume and the surface area of a cylinder");
        System.out.print("Enter the radius of the cylinder: ");//Prints and leaves cursor
        double radcyl = scanner.nextInt();//Takes user input and saves as variable
        System.out.print("Enter the height of the cylinder: ");//prints and leaves cursor
        double heightcyl = scanner.nextInt();//takes user input and saves as variable
        double radcylsquare= (radcyl*radcyl);//squares the radius
        //multiplies the radius^2 times pi
        double piradcylsquare=(float) (radcylsquare*Math.PI);
        //multiplies the radius^2 times pi times height
        double heightpiradcylsquare=(piradcylsquare*heightcyl);
        System.out.print("The volume of the cylinder is: ");//prints
        System.out.printf("%.2f", heightpiradcylsquare);//prints the volume to 2 decimals
        double piradcylheight=(float) (2*Math.PI*radcyl*heightcyl);//multiples pi*2*radius*height
        double piradcylsquaretwo= (piradcylsquare*2);//multiplies the radius^2 times pi*2
        //adds (pi*2*radius*height)with(radius^2 times pi*2)
        double sacyl=(piradcylsquaretwo+piradcylheight);
        //goes to a new line and prints
        System.out.print("\nThe Surface area of the cylinder is: ");
        System.out.printf("%.2f", sacyl);//prints the surface area to 2 decimals
        //goes to new line and prints
        System.out.println("\nNow, I am going to calculate the time it takes for a pendulum to swing a distance ");
        System.out.print("Enter the distance the pendulum travels in meters: ");//prints
        double dist = scanner.nextInt();//takes input and saves as variable
        double twopi=(double) (Math.PI*2);//multiplies Pi times 2
        double grav=(double) 9.8;//saves the gravity accel as a variable
        double distovergrav=(dist/grav);//divide the distance by the gravity
        double sqrt=(double) (Math.sqrt(distovergrav));//takes the square root of distance/gravity   
        double p=(twopi*sqrt);//multiplies the square root of distance/gravity by pi*2
        //prints
        System.out.print("The time the pendulum takes to swing your distance in seconds is: "+ " ");
        System.out.printf("%.2f", p);//prints the time to 2 decimals
        System.out.print("\nThanks for using my calculator");//prints
    }
    
}
