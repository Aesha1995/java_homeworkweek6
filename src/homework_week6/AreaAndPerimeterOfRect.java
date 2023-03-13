package homework_week6;

public class AreaAndPerimeterOfRect {
    //main method declare
    public static void main(String[] args) {
        rectangle();                            //static method calling
    }
    //declare static method
    public static void rectangle(){
        double h = 8.5;
        double w = 5.5;
        double area = (h*w);
        double peri = ((h+w)*2);
        System.out.println("Area of Rectangle : " +area);
        System.out.println("Parameter of Rectangle : " +peri);
    }
}
