package Question3;

public class Square extends Rectangle {
    public Square() {
        this(1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    @Override
    public void setWidth(double side) {
        if (super.getWidth() == super.getLength()) {
            super.setWidth(side);
        }
    }
    public void setLength(double side) {
        if (super.getWidth() == super.getLength()) {
            super.setLength(side);
        }
    }

    public String toString() {
        return  "A Square with side = " + super.getLength() + ", which is a subclass of " + super.toString();
    }

}
