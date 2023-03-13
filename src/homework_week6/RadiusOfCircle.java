package homework_week6;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r)
 */
public class RadiusOfCircle {

    //Main method declared
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of radius : ");
        double x = scan.nextInt();                      //store value from user
        radius(x);                                      //calling static method in main  method
        scan.close();
    }
    //Declare static method
    public static void radius(double x){
        double pi = 3.14;
        double radius = pi * x * x;
        System.out.println("Total area of circle : " +radius);
    }
}
