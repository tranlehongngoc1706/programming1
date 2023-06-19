import java.util.Scanner;
import java.lang.Math;

// There are 2 points A, B on a plane. The x and y coordinates of each point are entered by users.
// Calculate the circumference and area of the square whose one side is the line segment AB.
public class exercise4 {
    public static void main(String[] args) {
        System.out.print("Enter coordinates of A: ");
        Scanner A = new Scanner(System.in);
        int Ax = A.nextInt();
        int Ay = A.nextInt();

        System.out.print("Enter coordinates of B: ");
        Scanner B = new Scanner(System.in);
        int Bx = B.nextInt();
        int By = B.nextInt();

        double AB = Math.sqrt(Math.pow((Ax-Bx),2)+Math.pow((Ay-By),2));
        double circumference = AB * 4;
        double area = Math.pow(AB,2);

        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
}
