import java.util.Scanner;

// Implement the code to exchange the values of 2 variables x and y.
public class exercise2 {
    public static void main(String[] args) {
        System.out.print("Enter x and y : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Before: x = " + x + ", y = " + y);

        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After: x = " + x + ", y = " + y);
    }
}
