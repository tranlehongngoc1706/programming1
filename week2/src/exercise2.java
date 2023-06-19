import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of a square's side: ");
        int length = sc.nextInt();
        for(int i = 1; i <= length; i++) {
            String symbol = "*";
            if (i==1||i==length)
                System.out.println(symbol.repeat(length));
            else
                System.out.println(symbol+" ".repeat(length-2)+symbol);
        }
    }
}