package exercise3A;

public class Circle implements GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double getPerimeter(){
        return getRadius()*2*Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Circle[radius = %s]",getRadius());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
