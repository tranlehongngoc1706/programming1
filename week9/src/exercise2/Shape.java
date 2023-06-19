package exercise2;

abstract public class Shape {
    protected String color;
    protected boolean filled;

    public void Shape() {
        this.color = "red";
        this.filled = true;
    }

    public void Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return String.format("Shape[color = %s, filled = %s", color, String.valueOf(filled));
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
