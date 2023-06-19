/* Write a program that repeatedly prompts the user to enter a positive integer and checks
whether the number is divisible by both 5 and 6, or neither of them, or just one of them.
The program ends when the user enters a negative integer or zero. */

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        while (true) /*repeatedly prompts the user to enter a positive integer*/ {
            System.out.print("Enter the positive integer: ");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();

            if (i <= 0) {
                break;
            }

            if (i % 5 == 0 && i % 6 == 0) {
                System.out.println(i + " is divisible by both 5 and 6");
            } else if (i % 5 == 0 || i % 6 == 0) {
                System.out.println(i + " is divisible by both 5 or 6, but not both");
            } else {
                System.out.println(i + " is neither divisible by 5 nor 6");
            }
        }
        System.out.println("Goodbye!");
    }
}