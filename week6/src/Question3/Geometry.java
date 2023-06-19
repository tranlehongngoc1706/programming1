package Question3;

public class Geometry {
    public static void main(String[] args) {
        Shape shape = new Shape("blue",false);
        System.out.println(shape.toString());

        Rectangle rectangle = new Rectangle(2.0,2.0);
        System.out.println(rectangle.toString());

        Square square = new Square("blue",true,2.0);
        System.out.println(square.toString());
    }
}
