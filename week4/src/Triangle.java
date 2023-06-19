public class Triangle {
    private double side1;
    private double side2;
    private double side3;


    public Triangle(double side1,double side2, double side3) {
        this.setSide1(side1);
        this.setSide2(side2);
        this.setSide3(side3);
    }

    public void verify() {
        if (side1 > side2+side3 || side2 > side3+side1 || side3 > side1+side2)
           System.out.println("Not triangle");
        else if (side1==side2 && side2==side3)
            System.out.println("Equilateral triangle");
        else if (side1==side2 || side1==side3 || side2==side3)
            System.out.println("Isosceles triangle");
        else
            System.out.println("Scalene triangle");
    }


    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        if (side1>0)
        this.side1 = side1;
        else {
            this.side1 = 0;
            System.out.println("error side 1 input");
        }

    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        if (side2>0)
            this.side2 = side2;
        else {
            this.side2 = 0;
            System.out.println("error side 2 input");
        }
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        if (side3>0)
            this.side3 = side3;
        else {
            this.side3 = 0;
            System.out.println("error side 3 input");
        }
    }

}
