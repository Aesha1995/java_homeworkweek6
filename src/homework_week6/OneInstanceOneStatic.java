package homework_week6;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme
 */
public class OneInstanceOneStatic {
    static int a = 30;                                  // Static variable declared
    int b = 40;                                         // Instance variable declared

    // Main method declared
    public static void main(String[] args) {
        OneInstanceOneStatic obj = new OneInstanceOneStatic();
        obj.myMethod();                                 // Instance method calling
        myMethod1();                                    // Static method calling
    }
    // Instance method declared
    public void myMethod(){
        System.out.println("Instance Method");
        System.out.println(a);
                                                        //call both static and instance variable
        System.out.println(b);
    }
    // Static method declared
    public static void myMethod1(){
        OneInstanceOneStatic obj = new OneInstanceOneStatic();
        System.out.println("Static Method");
        System.out.println(a);
                                                        // call both static and instance variable
        System.out.println(obj.b);
    }
}
