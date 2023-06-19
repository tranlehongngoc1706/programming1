package Problem2;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(50.00);
        Account account2 = new Account(-7.53);
        System.out.println(account2.getBalance());
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount value:");
        double amount = sc.nextDouble();
        System.out.println(account1.credit(amount));
        System.out.println(account2.credit(amount));
    }
}
