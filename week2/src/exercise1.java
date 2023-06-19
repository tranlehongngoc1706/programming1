import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of a square's side: ");
        int length = sc.nextInt();
        for(int i = 1; i <= length; i++) {
            String symbol = "*";
            System.out.println(symbol.repeat(length));
        }
    }
}