package homework_week6;

/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class StaticVariableStaticMethod {
    static int a = 20;                                  //Static variable declare
    static int b = 30;                                  //Static variable declare

    //Main method declare
    public static void main(String[] args) {
        myMethod();                                      //Static method declare
    }

    public static void myMethod(){
        System.out.println(a);                          //Static variable calling
        System.out.println(b);                          //Static variable calling
    }
}
