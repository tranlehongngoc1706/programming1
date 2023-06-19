package Question3;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getArea() {
        return 2* Math.PI * radius;
    }

    public double getPerimeter() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "A Circle with radius =" + radius + ",which is a subclass of " + super.toString();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
