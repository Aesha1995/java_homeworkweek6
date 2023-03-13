package homework_week6;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);         // to input the value
        System.out.print("Enter the value of a: ");
        int a = scan.nextInt();
        System.out.print("Enter the value of b: ");
        int b = scan.nextInt();
        SwapNumber obj = new SwapNumber();            // created obj object to call the instance method
        obj.swapNumbers(a,b);                        // Instance method calling in main method
        scan.close();

    }
    public void swapNumbers(int x ,int y) //declaring instance method
    {
        int z=x;
        x=y;
        y=z;
        System.out.println("The value of a after swap : " + x); 
        System.out.println("The value of b after swap : " + y);

    }
}
