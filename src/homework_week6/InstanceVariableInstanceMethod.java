package homework_week6;

/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class InstanceVariableInstanceMethod {
    int a = 10;                                             // Declare instance variable
    int b = 20;                                             // Declare instance variable

    // Declare Main method
    public static void main(String[] args) {
        InstanceVariableInstanceMethod obj = new InstanceVariableInstanceMethod();
        obj.myMethod();                                     //Calling instance method into main method
    }
    public void myMethod(){
        System.out.println(a);                              // calling instance variable
        System.out.println(b);                              // calling instance variable
    }
}
