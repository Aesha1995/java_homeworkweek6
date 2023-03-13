package homework_week6;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class TwoInstanceTwoStatic {
    static int a = 10;                      //Static variable declare
    static int b = 20;                      //Static variable declare
    int c = 30;                             //Instance variable declare
    int d = 40;                             //Instance variable declare

    // Main method declared
    public static void main(String[] args) {
        TwoInstanceTwoStatic obj = new TwoInstanceTwoStatic();
        obj.myMethod();                       //Instance method calling
        myMethod1();                          //Static method calling
    }
    //Instance method declare
    public void myMethod(){
        System.out.println("Instance Method");
        System.out.println(a);                  //Static variable calling
        System.out.println(b);                  //Static variable calling
        System.out.println(c);                  //Instance variable calling
        System.out.println(d);                  //Instance variable calling
    }
    //Static method declare
    public static void myMethod1(){
        System.out.println("Static Method");
        TwoInstanceTwoStatic obj = new TwoInstanceTwoStatic();
        System.out.println(a);                  //Static variable calling
        System.out.println(b);                  //Static variable calling
        System.out.println(obj.c);              //Instance variable calling
        System.out.println(obj.d);              //Instance variable calling
    }

}
