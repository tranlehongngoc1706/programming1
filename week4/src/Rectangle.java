public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.setHeight(height);
        this.setWidth(width);
    }

    public void visualise() {
        String symbol = "*";
        for (int i=0; i<=height; i++) {
            System.out.println(symbol.repeat(width));
        }
        System.out.println();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width >= 1)
            this.width = width;
        else {
            this.width = 1;
            System.out.println("error width input");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height >= 1)
            this.height = height;
        else {
            this.height = 1;
            System.out.println("error height input");
        }
    }
}
