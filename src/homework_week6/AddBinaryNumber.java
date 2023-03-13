package homework_week6;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers
 */
public class AddBinaryNumber {
    //main method declared
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first binary number : ");
        String a = scanner.nextLine();
        System.out.print("Please enter second binary number : ");
        String b = scanner.nextLine();
        int n1 = Integer.parseInt(a, 2);
        int n2 = Integer.parseInt(b, 2);
        int n3 = n1 + n2;
        System.out.println("Addition of two binary number : " + Integer.toBinaryString(n3));
        scanner.close();
    }
}



