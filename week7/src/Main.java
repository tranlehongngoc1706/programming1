import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();

        Circle myCircle = new Circle(radius);
        System.out.printf("The area of the circle: %f\n",myCircle.getArea());
        System.out.println("The circle info:"+ myCircle);

        System.out.println("Enter the height of the cylinder:");
        double height = sc.nextDouble();
        Cylinder myCylinder = new Cylinder(radius,height);
        System.out.printf("The area of the circle: %f\n",myCylinder.getArea());
        System.out.println("The cylinder info:"+ myCylinder);

    }
}