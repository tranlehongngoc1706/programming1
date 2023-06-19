import java.util.Scanner;
import java.lang.Math;

public class exercise4 {
    public static void main(String[] args) {
        Scanner circle1 = new Scanner(System.in);
        System.out.println("Enter circle 1's center x-, y-coordinates, and radius");
        double x1 = circle1.nextDouble();
        double y1 = circle1.nextDouble();
        double radius1 = circle1.nextDouble();

        Scanner circle2 = new Scanner(System.in);
        System.out.println("Enter circle 2's center x-, y-coordinates, and radius");
        double x2 = circle2.nextDouble();
        double y2 = circle2.nextDouble();
        double radius2 = circle2.nextDouble();

        // Euclidean distance between two circle center points
        double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        if (distance < Math.abs(radius1 - radius2)) {
            System.out.println("One circle is inside the other circle!");
        } else if (distance < (radius1 + radius2)) {
            System.out.println("One circle overlaps the other circle!");
        } else {
            System.out.println("Two circles do not overlap each other!");
        }
    }
}
