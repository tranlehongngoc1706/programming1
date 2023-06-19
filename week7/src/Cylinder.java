public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder[%s, height = %f]", super.toString(),this.getHeight());
    }

    public double getVolume() {
        double volume = super.getArea()*this.getHeight();
        return volume;
    }

    @Override
    public double getArea() {
        double area = 2 * super.getArea()+ 2 * Math.PI * this.getHeight();
        return area;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
