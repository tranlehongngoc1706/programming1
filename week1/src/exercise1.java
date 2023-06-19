import java.util.Scanner;

public class exercise1 {
    /* Implement a Java program to output your name in a frame.
    The number of * in line 1 = that of line 3 = the number of characters in line 2 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String myName = sc.nextLine();
        String middleString = "*" + myName + "*";
        String topBottomString = "*".repeat(middleString.length());
        System.out.println(topBottomString);
        System.out.println(middleString);
        System.out.println(topBottomString);
    }
}
