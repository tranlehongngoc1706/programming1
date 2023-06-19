package exercise3A;

public class Rectangle implements GeometricObject{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return getWidth() * getLength();
    }

    @Override
    public double getPerimeter() {
        return (getWidth() + getLength()) * 2;
    }

    @Override
    public String toString() {
        return String.format("Rectangle[width = %s, length = %s]",getWidth(),getLength());
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
