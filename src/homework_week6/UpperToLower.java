package homework_week6;

import java.util.Scanner;

public class UpperToLower {
    //main method declared
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Upper case String : ");
        String a1 = scan.nextLine();
        upper(a1);                      // static method calling in main method
        scan.close();
    }
    public static void upper(String s1){

        System.out.println("Lower case is : " +s1.toLowerCase());
    }

}
