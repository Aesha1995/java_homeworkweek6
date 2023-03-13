package homework_week6;
/**
 * Write a Java program to convert a given string into lowercase
 */

import java.util.Scanner;

public class LowerToUpper {
    //main method declared
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any Lower case String : ");
        String a1 = scan.nextLine();
        LowerToUpper obj = new LowerToUpper();
        obj.lower(a1);                         // static method calling in main method
        scan.close();
    }
    //static method declared
    public static void lower(String s1){

        System.out.println("Upper case is : " +s1.toUpperCase());
    }
}
