package exercise2;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled ) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Circle[%s, radius = %s]", super.toString(), radius);
    }


}
