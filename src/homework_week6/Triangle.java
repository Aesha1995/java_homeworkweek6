package homework_week6;
/**
 * Write a program to calculate the area of a triangle
 */

import java.util.Scanner;
public class Triangle {
    //main method declared
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter Height : ");
        float a = scan.nextFloat();
        System.out.print("Please Enter Width : ");
        float b = scan.nextFloat();
        Triangle obj = new Triangle();              //object created
        obj.tri(a,b);                               //Instance method calling in main method
        scan.close();
    }
    // Instance method declared
    public void tri(float h, float w){
        float tri = ((h * w) / 2);
        System.out.println("Area of Triangle is : " +tri);
    }
}
