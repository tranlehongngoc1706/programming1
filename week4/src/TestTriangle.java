import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of the first side:");
        double side1 = sc.nextDouble();
        System.out.println("Please enter the length of the second side:");
        double side2 = sc.nextDouble();
        System.out.println("Please enter the length of the third side:");
        double side3 = sc.nextDouble();
        Triangle triangle = new Triangle(side1,side2,side3);
        triangle.verify();
    }
}
