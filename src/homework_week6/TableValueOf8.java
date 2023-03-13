package homework_week6;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10
 */

import java.util.Scanner;

public class TableValueOf8 {
    //Declare main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any positive Number : ");
        int a = scan.nextInt();                         //Store value from user
        multiNumber(a);                                 //calling Static method in main method
        scan.close();
    }
    // Declare static method
    public static void multiNumber(int n){
        System.out.println( n + " X " + 1 + " = " + (n*1));
        System.out.println( n + " X " + 2 + " = " + (n*2));
        System.out.println( n + " X " + 3 + " = " + (n*3));
        System.out.println( n + " X " + 4 + " = " + (n*4));
        System.out.println( n + " X " + 5 + " = " + (n*5));
        System.out.println( n + " X " + 6 + " = " + (n*6));
        System.out.println( n + " X " + 7 + " = " + (n*7));
        System.out.println( n + " X " + 8 + " = " + (n*8));
        System.out.println( n + " X " + 9 + " = " + (n*9));
        System.out.println( n + " X " + 10 + " = " + (n*10));

    }

}
