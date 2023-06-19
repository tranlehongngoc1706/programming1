public class Triangle extends Shape{
    private int base;
    private int height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("Triangle[color = %s, length= %d, height= %d]" ,this.getColor(), this.getBase(),this.getHeight());
    }

    @Override
    public double getArea() {
        double area = 0.5 * this.getHeight() * this.getBase();
        return area ;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
