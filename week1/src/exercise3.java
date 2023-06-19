import java.util.Scanner;

// The number of seconds from midnight to now is S. Display the current time as "h:m:s"
public class exercise3 {
    public static void main(String[] args) {
        System.out.print("The number of seconds from midnight to now is: ");
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int h = S/3600, m = (S%3600)/60, s = (S%3600)%60;
        System.out.printf("The current time is: %d:%d:%d",h,m,s);
    }
}
