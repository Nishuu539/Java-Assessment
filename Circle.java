public class Circle {
    private double _radius;     // Here, radius and color are two private instances..
    private String _color;

    Circle() {
        this._color = "Red";
        this._radius = 1.0;
    }
           // Constructor Overloading.                                     
    Circle(double r, String c) {
        this._radius = r;
        this._color = c;
    }
                 //getRadius and getColor are two public methods ..
    double getRadius() {
        return this._radius;
    }

    String getColor() {
        return this._color;
    }

    double getArea() {
        return 3.14 * this._radius * this._radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5, "green");

        System.out.println("Circle 1 radius,color and area is" + circle1.getRadius() + " , "+circle1.getColor() +" "+ circle1.getArea());
        System.out.println("Circle 2 radius,color and area is" + circle2.getRadius() + " , "+circle2.getColor() +" "+ circle2.getArea());
    }
}