package homework_week6;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 *convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class Temperature {

    //Declared main method
    public static void main(String[] args) {
        System.out.print("Enter temperature in Fahrenheit : ");
        Scanner scan = new Scanner(System.in);
        double f = scan.nextInt();
        temp(f);                                    //Calling static method
        scan.close();
    }
    // Declared static method
    public static void temp(double f){
        double temp = ((f-32) * 5 / 9);
        System.out.println("Temperature in Celsius : " +temp);
    }
}
