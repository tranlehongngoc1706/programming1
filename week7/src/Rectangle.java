public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        double area = width * length ;
        return area;
    }

    @Override
    public String toString() {
        return String.format("Rectangle[color = %s, length= %d, height= %d]" ,this.getColor(),this.getLength(), this.getWidth());

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
