package homework_week6;

/**
 * Write a Java program to compute the specified expressions and print the
 * output.
 */
public class MathematicalString {
    //Main method declared
    public static void main(String[] args) {
        double a = 25.5;
        double b = 3.5;
        double c = 40.5;
        double d = 4.5;
        double e = ((a * b - b * b)/ (c - d));
        System.out.println("Expected output : " + e);
    }


}
