import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height:");
        int height = sc.nextInt();
        System.out.println("Please enter the width:");
        int width = sc.nextInt();
        Rectangle rectangle = new Rectangle(width,height);
        rectangle.visualise();
    }
}