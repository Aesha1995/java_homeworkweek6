package homework_week6;

import java.util.Scanner;

public class TwoNumberAction {
    // main method declared
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First value : ");
        double x = scan.nextDouble();               // store first value from user
        System.out.println("Enter second value : ");
        double y = scan.nextDouble();               // store first value from user
        TwoNumberAction obj = new TwoNumberAction();
        obj.operation(x,y);                         // Instance method calling in main method
        scan.close();
    }
    // Instance method declared
    public void operation(double a, double b){
        double add = a+b;
        double sub = a-b;
        double mul = a*b;
        double div = a/b;
        double mod = a%b;
        System.out.println("Addition of two number is : " +add);
        System.out.println("Subtraction of two number is : " +sub);
        System.out.println("Multiplication of two number is : " +mul);
        System.out.println("Division of two number is : " +div);
        System.out.println("Reminder of two number is : " +mod);
    }

}
