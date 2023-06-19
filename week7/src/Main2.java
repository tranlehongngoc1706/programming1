import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the color:");
        String color = sc.nextLine();

        System.out.println("Enter the length and the width of the rectangle :");
        int length = sc.nextInt();
        int width = sc.nextInt();

        Rectangle myRectangle = new Rectangle(color,length,width);
        System.out.printf("The area of the rectangle: %.1f\n", myRectangle.getArea());
        System.out.printf("The rectangle info: %s\n", myRectangle);

        System.out.println("Enter the base and the height of the triangle:");
        int base = sc.nextInt();
        int height = sc.nextInt();

        Triangle myTriangle = new Triangle(color,base,height);
        System.out.printf("The area of the triangle: %.1f\n", myTriangle.getArea());
        System.out.printf("The rectangle info: %s\n", myTriangle);

    }
}
