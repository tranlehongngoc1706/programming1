import java.util.Scanner;

public class TestDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // point A
        System.out.println("Enter the first point x and y:");
        double xA = sc.nextDouble();
        double yA = sc.nextDouble();

        // point B
        System.out.println("Enter the second point x and y:");
        double xB = sc.nextDouble();
        double yB = sc.nextDouble();

        Point A = new Point(xA,yA);
        Point B = new Point(xB,yB);

        System.out.printf("The distance between two points: %.2f", A.distance(B));
    }
}
