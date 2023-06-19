import java.util.Scanner;
import java.util.ArrayList;

public class exercise6 {
    public static void shoppingOrders() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new number ID for order:");
        int id = scanner.nextInt();
        System.out.println("How many items in the order");
        int items = scanner.nextInt();
        ArrayList<Integer> shoppingCart = new ArrayList<Integer>();
        int sum = 0;

        while (true) {
            if (items <= 0 || (shoppingCart.size() + 1) > items) {
                break;
            }
            System.out.printf("Please enter the name for item %d\n", (shoppingCart.size()+1));
            String name = scanner.next();
            System.out.printf("Please enter the price for item %d\n", (shoppingCart.size()+1));
            int price = scanner.nextInt();
            shoppingCart.add(price);
            sum += price;
        }
        double average = (sum/items);

        System.out.printf("You have a new order with ID: %d\n",id);
        System.out.printf("In the order, you have %d items.\n",items);
        System.out.printf("The average price in the order is: %.2f",average);

    }
    public static void main(String[] args) {
        shoppingOrders();
    }
}
