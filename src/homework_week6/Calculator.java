package homework_week6;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 and division methods all with parameters and use string concatenation
 methods.(Note: Two static and Two instance methods.)
 *
 */

import java.util.Scanner;
//
public class Calculator {
    //Main method declare
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First value : ");
        int a = scan.nextInt();                              // store first value from user
        System.out.println("Enter Second value : ");
        int b = scan.nextInt();                             // store second value from user
        addition(a,b);                                      // static method  calling
        subtraction(a,b);                                   // static method calling
        Calculator obj = new Calculator();                  // object created
        obj.multiplication(a,b);                            // instance method calling
        obj.division(a,b);                                  // instance method calling
        scan.close();
    }

    // Static method declared
    public static void addition(int a, int b){
        int add = a+b;
        System.out.println("Addition of two number : " + add);

    }
    // Static method declared
    public static void subtraction(int a, int b){
        int sub = a-b;
        System.out.println("Subtraction of Two number : " +sub);

    }
    // Instance method declared
    public void multiplication(int a, int b){
        int mul = a*b;
        System.out.println("Multiplication of Two number : " +mul);

    }
    // Instance method declared
    public void division(int a, int b){
        int div = a/b;
        System.out.println("Division of Two number : " +div);
    }

}
