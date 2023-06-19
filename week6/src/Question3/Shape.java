package Question3;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        this("red",true);
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // "A Shape with color of xxx and
    // filled/Not filled".

    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + isFilled();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String isFilled() {
        if (filled == true)
            return "is filled";
        else
            return "is not filled";
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

}
