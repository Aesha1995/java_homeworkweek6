package homework_week6;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Decimal value : ");
        int s1 = scan.nextInt();
        String s2 = Integer.toBinaryString(s1);
        System.out.println("Binary value is : " +s2);
        scan.close();
    }
}
