package homework_week6;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers
 */
public class AverageOfNumber {
    //main method declared
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First value : ");
        float x = scan.nextFloat();                     //store first value
        System.out.print("Enter Second value : ");
        float y = scan.nextFloat();                     //store Second value
        System.out.print("Enter third value : ");
        float z = scan.nextFloat();                     //store Third value
        AverageOfNumber obj = new AverageOfNumber();    //Object created
        obj.average(x,y,z);                             //Instance method calling in main method
        scan.close();
    }
    //Instance method created
    public void average(float a,float b,float c){
        float avg = ((a+b+c)/3);
        System.out.println("Average of total number : " +avg);

    }
}
