import java.util.Scanner;

public class exercise3 {
    public static String main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 numbers for the sides of the triangle:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // verify input
        if (a < b + c || b < a + c || c < a + b) {
            if (a == b && b == c)
                return "Equilateral triangle";
            else if (a == b || b == c || c == a)
                return "Isosceles triangle";
            else
                return "Scalene triangle";
        } else {
            return "Not triangle";
        }
    }
}
