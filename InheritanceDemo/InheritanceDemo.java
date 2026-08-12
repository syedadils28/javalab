/*7. Write a JAVA program to demonstrate Inheritance. Simple Program on
Java for the implementation of Multiple inheritance using interfaces to
calculate the area of a rectangle and triangle.
 */

interface rectangle {
    void Area_rectangle(double w, double h);

}

interface triangle {
    void Area_triangle(double b, double h);
}

class A implements rectangle, triangle {
    public void Area_rectangle(double w, double h) {
        double Ar = w * h;
        System.out.println("area of rectangle is: " + Ar);
    }

    public void Area_triangle(double b, double h) {
        double area = 0.5 * b * h;
        System.out.println("Area of traingle is: " + area);
    }
}

public class InheritanceDemo {
    public static void main(String args[]) {
        A ob1 = new A();
        ob1.Area_rectangle(10.5, 70.8);
        ob1.Area_triangle(10.40, 50.2);
    }
}
